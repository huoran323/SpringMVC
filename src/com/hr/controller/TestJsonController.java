package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestJsonController {

	/**
	 * springMVC处理json的四个条件
	 * 	1.导入jackson的jar
	 * 	2.在springMVC的配置文件中开启MVC驱动，<mvc:annotation-driven/>
	 * 	3.在处理ajax请求的方法上加上注解@ResponseBody
	 * 	4.将要转换为json且响应到客户端的数据，直接作为该方法的返回值返回
	 * @return
	 */
	@RequestMapping("/testJson")
	@ResponseBody
	public String testJson() {
		return "success";
	}
	
	//示例
//	@RequestMapping("/testJson")
//	@ResponseBody
//	public Collection<User> testJson() {
//		Collection<User> users = dao.getAll();
//		return users;
//	}
}
