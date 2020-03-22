package com.hr.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestExceptionController {

	@RequestMapping(value="/testException", method=RequestMethod.GET)
	public String testException(){
		String s = null;
		System.out.println(s.substring(0,5));
		return "success";
	}
}
