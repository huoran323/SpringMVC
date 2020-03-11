package com.hr.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	/**
	 * 假如：localhost:8080/SpringMVC/hello
	 */
	@RequestMapping("hello") //注解中的value值要与请求的地址一样，而不是与方法名一样
	public String helloworld(){
		System.out.println("SUCCESS");
		return "success"; //视图名称
	}
}
