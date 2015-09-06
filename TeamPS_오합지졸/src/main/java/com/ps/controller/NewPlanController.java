package com.ps.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ps.service.BoardService;
import com.ps.vo.Board;


@Controller
public class NewPlanController {

	String gnum1;
	
	@Autowired
	BoardService service;
	

	@RequestMapping(value = "/newPlan.ps", method = RequestMethod.GET)
	public String get(String gnum,Board b, Model model ,HttpSession session ) {
		System.out.println("gnum¿Ã¥Ÿ"+gnum);
		gnum1 = gnum;
		
		return "newPlan";
		
	
	}
	
	@RequestMapping(value = "/newPlan.ps", method = RequestMethod.POST)
	public String post(String gnum,Board b,Model model ,HttpSession session ) {
		
		Board p = new Board();
		p = b;
		p.setGnum(gnum1);
		
		service.insert(p);
		
			return "newPlan";
		
	
	}

}
