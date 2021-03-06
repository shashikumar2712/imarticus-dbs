package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.beans.Employee;

@Controller
public class MyController {


	@RequestMapping(value="/addEmployee",method= RequestMethod.GET)
	public ModelAndView addEmployee() {
		ModelAndView mv=new ModelAndView("EmployeeForm");
		return mv;
	}
	
	@RequestMapping(value="/addEmployee" , method = RequestMethod.POST )
	public ModelAndView  newEmployee(Employee employee) {
		ModelAndView mv=new ModelAndView("DisplayEmployee");
		mv.addObject("emp", employee);
		return mv;
	}
	
	
}
