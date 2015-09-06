package com.ps.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ps.service.GPSService;
import com.ps.service.MGService;
import com.ps.vo.GPS;
import com.ps.vo.MG;

@Controller
public class SearchController {
	@Autowired
	GPSService service;
	

	
	@RequestMapping(value = "/search.ps", method = RequestMethod.GET)
	public String get(HttpServletResponse response) {
		
		return "main_right";
	}
	@RequestMapping(value = "/search.ps", method = RequestMethod.POST)
	public String post(String gnum, HttpServletResponse response, String search, Model model, HttpSession session) {
		System.out.println("search" + search);
		List<GPS> list1 = service.findBySearch(search);
		
		System.out.println(list1.size());		
		
			model.addAttribute("list1",list1);
			model.addAttribute("search",search);
			
			
		return "main_right2";
	}


}
