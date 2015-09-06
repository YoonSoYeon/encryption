package com.ps.controller;

import java.io.Console;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;
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
import com.ps.vo.PS;

//customer table의 모든 데이터를 가져오기
@Controller
public class MainController {	
	@Autowired
	PSService service;//db 작업 하기 위해 필요함, impl이 실제로 주입됨
	@Autowired
	MGService service1;

	@RequestMapping(value = "/main.ps", method = RequestMethod.GET)
	public String home(Model model) {
	//	List<PS>  list = service.all();
	//	System.out.println(service);
	//model.addAttribute("list", list );


		return "main";//view(화면) 이름
	}
	
	@RequestMapping(value = "/main.ps", method = RequestMethod.POST)
	public String post(Model model,HttpSession session) {
	//	List<PS>  list = service.all();
	//	System.out.println(service);
	//model.addAttribute("list", list );
		


		return "main";//view(화면) 이름
	}
	
	
	@RequestMapping(value = "/main_top.ps", method = RequestMethod.GET)
	public String home1(Model model) {
		return "main_top";//view(화면) 이름
	}
	
	@RequestMapping(value = "/main_right.ps", method = RequestMethod.GET)
	public String home2(Model model) {
		return "main_right";//view(화면) 이름
	}
	
	@RequestMapping(value = "/main_right2.ps", method = RequestMethod.GET)
	public String home7(Model model) {
		return "main_right2";//view(화면) 이름
	}
	
	@RequestMapping(value = "/main_left.ps", method = RequestMethod.GET)
	public String home3(Model model ,HttpSession session ) {
		if(session.getAttribute("login") != null){
			String id = (String) session.getAttribute("login");
			List<MG>  list2 = service1.findByName(id);
			model.addAttribute("list2", list2 );

			return "main_left2";//view(화면) 이름
		}else{
			return "main_left";
		}
	
	}
	@RequestMapping(value = "/main_left.ps", method = RequestMethod.POST)
	public String homepost(Model model ,HttpSession session ) {
		if(session.getAttribute("login") != null){
			String id = (String) session.getAttribute("login");
			List<MG>  list2 = service1.findByName(id);
			model.addAttribute("list2", list2 );

			return "main_left2";//view(화면) 이름
		}else{
			return "main_left";
		}
	
	}
	
	@RequestMapping(value = "/main_left2.ps", method = RequestMethod.GET)
	public String home4(Model model) {
		
		return "main_left2";//view(화면) 이름
	}

	
	@RequestMapping(value = "/uselogin.ps", method = RequestMethod.GET)
	public String home5(Model model) {
		
		return "uselogin";//view(화면) 이름
	}
	
	@RequestMapping(value = "/index.ps", method = RequestMethod.GET)
	public String home6(Model model) {
		
		return "index";//view(화면) 이름
	}
	@RequestMapping(value = "/ddd.ps", method = RequestMethod.GET)
	public String home8(Model model) {
		
		return "ddd";//view(화면) 이름
	}
	
	
}














