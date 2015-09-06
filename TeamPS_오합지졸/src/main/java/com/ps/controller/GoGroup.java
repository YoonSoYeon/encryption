package com.ps.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ps.service.GIPSService;
import com.ps.service.GPSService;
import com.ps.vo.GIPS;
import com.ps.vo.GPS;



@Controller
public class GoGroup {	
	@Autowired
	GPSService service;
	
	@Autowired
	GPSService service2;
	
	@Autowired
	GIPSService service1;
	
	GPS gnum1;

	
	@RequestMapping(value = "/go_group.ps", method = RequestMethod.GET)
	public String get(GPS c) {
		
	//	service.insert(c);
		return "join_group";//view(화면) 이름
	}

	
}
