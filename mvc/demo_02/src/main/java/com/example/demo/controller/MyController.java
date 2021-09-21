package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
   
	@RequestMapping("hello")
	public String hello(HttpServletRequest request,HttpSession session) {
		String name = request.getParameter("name");
		session.setAttribute("name", name);
		return "hello";
	}
}
