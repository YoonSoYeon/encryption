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
public class MakeGoupController {	
	@Autowired
	GPSService service;
	
	@Autowired
	GPSService service2;
	
	@Autowired
	GIPSService service1;
	
	GPS gnum1;

	
	@RequestMapping(value = "/join_group.ps", method = RequestMethod.GET)
	public String get(GPS c) {
		
	//	service.insert(c);
		return "join_group";//view(화면) 이름
	}
	@SuppressWarnings("null")
	@RequestMapping(value = "/ginsert.ps", method = RequestMethod.POST)
	public void post(GPS c, HttpServletResponse response) {
		
		//GPS p = c;
		service.ginsert(c);
		System.out.println(c.getGname()+"그룹이름 그룹이름");
		
		gnum1 = service2.findByName(c.getGname());

		System.out.println(gnum1.getGnum()+"giunme"+c.getGname()+"ginum");
		GIPS p = new GIPS();
		p.setGinum(gnum1.getGnum());
		p.setGiname(c.getGname());
		
		service1.ginfoinsert(p);
		
		try {

			response.sendRedirect("main.ps");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //view(화면) 이름
	}
	
}
