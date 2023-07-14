package com.ps20520.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ScopeController {
	 
	@Autowired
	HttpServletRequest request;
	@Autowired
	HttpSession session;
	@Autowired
	ServletContext servetContext;
	
	
	@RequestMapping("/scope")
	public String hello(Model model) { 
		model.addAttribute("a","I am a model");
		request.setAttribute("b", "I am in request");
		session.setAttribute("c", "I am in session");
		servetContext.setAttribute("d", "I am in ServletContext");
		return "scope";
	}
}
