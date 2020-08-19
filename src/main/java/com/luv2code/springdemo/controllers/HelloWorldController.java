package com.luv2code.springdemo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//need a controller method to provide intial jsp/html form
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-from";
	}
	
	//need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	//need a controller method to read data form data
	//add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model){
		//read data(or parameter data) from the request object
		String theName = request.getParameter("studentName");
		
		//convert the data to caps
		theName=theName.toUpperCase();
		
		//create the message
		String result="Yo! "+theName;
		
		//add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}

}
