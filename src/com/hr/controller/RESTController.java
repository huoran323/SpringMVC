package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RESTController {

	@RequestMapping(value="/testREST/{id}",method=RequestMethod.GET)
	public String getUserById(@PathVariable("id")Integer id){
		System.out.println("GET id="+id);
		return "success";
	}
	
	@RequestMapping(value="/testREST",method=RequestMethod.POST)
	public String insertUser(){
		System.out.println("POST");
		return "success";
	}
	
	@RequestMapping(value="/testREST",method=RequestMethod.PUT)
	public String updateUser(){
		System.out.println("PUT");
		return "success";
	}
	
	@RequestMapping(value="/testREST/{id}",method=RequestMethod.DELETE)
	public String deleteUser(@PathVariable("id")Integer id){
		System.out.println("DELETE, id="+id);
		return "success";
	}
}
