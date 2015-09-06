package com.ps.controller;

import java.util.List;

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
public class LoginController {

	
	@Autowired
	MGService service1;
	
	@RequestMapping(value = "/login.ps", method = RequestMethod.GET)
	public String get(Model model) {
		
		return "main_left";
	}

	@RequestMapping(value = "/login.ps", method = RequestMethod.POST)
	public String post(String id, HttpSession session, Model model) {
		session.setAttribute("login", id);
		List<MG> list2 = service1.findByName(id);
		model.addAttribute("list2", list2 );
		
	
			return "main_left2";
			
		

	}

}
