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
import com.ps.service.PSService;
import com.ps.vo.GPS;
import com.ps.vo.MG;

//customer table의 모든 데이터를 가져오기
@Controller
public class GroupSecessionController {	
	@Autowired
	MGService service;
	@Autowired
	GPSService service1;

	@RequestMapping(value = "/group_secession.ps", method = RequestMethod.POST)
	public String post(Model model, HttpSession session, String gnum) {
		String id = (String) session.getAttribute("login");
		
		
		//MG c = service.findByName(id);
		System.out.println("나는"+gnum);
		MG m = new MG();
		
		m.setGmnum(gnum);
		m.setGid(id);
		service.deleteByName(m);
		
		return "main";//view(화면) 이름
	}
	
}














