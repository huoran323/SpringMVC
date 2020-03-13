package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {

	/**
	 * 在springMVC获取客户端传递的数据的方式：
	 * 	1、在处理请求的方法中，加入相对应的形参，保证形参参数名和传递的数据的参数名保持一致，就可以自动赋值
	 * 		@RequestParam(value="name", required=false, defaultValue="admin"
	 * 			value：当不满足赋值条件时，可以使用value属性，指定映射关系(即客户端传递过来的参数名与方法的形参名不一致的情况)
	 * 			required：设置形参是否必须被赋值，默认值为true；若设置为false，则不必须赋值，因此形参的值为null
	 * 			defaultValue：若形参所获得的值为null，则设置一个默认值(用在分页和模糊查询中)
	 * @param username
	 * @param password
	 * @param age
	 * @return
	 */
	@RequestMapping(value="/param", method=RequestMethod.POST)
	public String param(@RequestParam(value="name", required=false, defaultValue="admin")String username, String password, String age){
		System.out.println("username="+username+",password="+password+",age="+age);
		return "success";
	}
}
