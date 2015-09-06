package com.ps.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {

	@RequestMapping(value = "/logout.ps", method = RequestMethod.GET)
	public void home(HttpSession session, HttpServletResponse response) {
		session.removeAttribute("login");
		session.removeAttribute("login_pass");
		
		try {
			response.sendRedirect("main_left.ps");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
