package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value="/register" , method = RequestMethod.GET)
	public String getResister() {
		return "home";
	}
	
	@RequestMapping(value="/register" , method = RequestMethod.POST )
	public String register(@RequestParam("name") String name,@RequestParam("id") int id,HttpSession session) {
		session.setAttribute("id", id);
		session.setAttribute("name", name);
		return "display";
	}
	

}
