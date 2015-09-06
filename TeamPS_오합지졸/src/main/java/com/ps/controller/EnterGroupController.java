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
public class EnterGroupController {

	
	@Autowired
	MGService service1;

	@Autowired
	GPSService service2;
	
	@RequestMapping(value = "/entergroup.ps", method = RequestMethod.POST)
	public void post(String gnum, HttpServletResponse response, String search, Model model, HttpSession session) {
	
		if(gnum != null){
		System.out.println("hihihi"+gnum);
		
		String id = (String) session.getAttribute("login");
		GPS p = service2.findBygname(gnum);
		System.out.println("hello"+p.getGname());
		
		MG m = new MG();
		m.setGmnum(gnum);
		m.setGid(id);
		m.setGname(p.getGname());
		
		service1.mginsert(m);
		System.out.println(m.getGmid() + "나는 m이다");
		/*return "groun_main.ps?gnum="+gnum;*/
		try {
			response.sendRedirect("group_main.ps?gnum="+gnum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		
	}


}
