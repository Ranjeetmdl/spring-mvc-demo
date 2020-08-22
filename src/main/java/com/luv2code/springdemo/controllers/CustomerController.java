package com.luv2code.springdemo.controllers;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.beans.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//add an initBinder...to convert/trim input String
	//remove leading and trailing whitespace
	//resolve issue for our validation
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theMode) {
         theMode.addAttribute("customer", new Customer());
         return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") 
	Customer theCustomer, BindingResult bindingResults){
		System.out.println("Last Name :|"+theCustomer.getLastName()+"|");
		
		System.out.println("Binding Results :"+bindingResults);
		
		if(bindingResults.hasErrors()){
			return "customer-form";
		}else{
			return "customer-confirmation";
		}
	}

}
