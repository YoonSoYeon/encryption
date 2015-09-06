package com.ps.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ps.service.BoardService;
import com.ps.service.GPSService;
import com.ps.service.PSService;
import com.ps.vo.Board;
import com.ps.vo.GPS;

@Controller
public class GroupMainController {	
	@Autowired
	GPSService service;
	
	@Autowired
	PSService service1;
	
	@Autowired
	BoardService service2;
	
	String gnum1;
	
	@RequestMapping(value = "/group_main.ps", method = RequestMethod.GET)
	public String get(String gnum, Model model) {
		gnum1 = gnum;
		System.out.println("나는get" + gnum);
	//	service.insert(c);
		return "group_main";//view(화면) 이름
	}
	
	@RequestMapping(value = "/group_main.ps", method = RequestMethod.POST)
	public String post(String gnum, Model model) {
		gnum1 = gnum;
		System.out.println("나는post" + gnum);
	//	service.insert(c);
		return "group_main";//view(화면) 이름
	}
	
	
	@RequestMapping(value = "/group_main_top.ps", method = RequestMethod.GET)
	public String home1(Model model) {
		System.out.println(gnum1+"gnum1");
		GPS c = service.findByNum(gnum1);
		model.addAttribute("c",c);
		
		return "group_main_top";//view(화면) 이름
	}
	
	@RequestMapping(value = "/group_main_right.ps", method = RequestMethod.GET)
	public String home2(Model model) {
		List<Board> list = service2.all();
		
		model.addAttribute("list", list );
		
		return "group_main_right";//view(화면) 이름
	}

	
	@RequestMapping(value = "/group_main_left.ps", method = RequestMethod.GET)
	public String home3(Model model  ) {
		GPS g = service.findByNum(gnum1);
		System.out.println(g.getGnum());
		System.out.println("dfgfdgd"+g.getGnum());
		
		
		model.addAttribute("g",g);
		
			return "group_main_left";
		
	
	}
	
	
	@RequestMapping(value = "/groupinfo.ps", method = RequestMethod.GET)
	public String home5(Model model) {
		GPS d = service.findByNum(gnum1);
		model.addAttribute("d",d);
		
			return "groupinfo";
		
	
	}
	
}
