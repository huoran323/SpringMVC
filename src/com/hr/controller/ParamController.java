package com.hr.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hr.bean.User;

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
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(@RequestParam(value="username", required=false, defaultValue="admin")String username, String password, String age){
//		System.out.println("username="+username+",password="+password+",age="+age);
//		return "success";
//	}
	
	/**
	 * @RequestHeader: 在处理请求的方法上，获取请求头信息，用法和@RequestParam一致
	 * @param AcceptLangunage
	 * @return
	 */
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(@RequestHeader(value="Accept-Language")String AcceptLangunage){
//		System.out.println("Accept-Language="+AcceptLangunage);
//		return "success";
//	}
	
	/**
	 * @CookieValue: 在处理请求的方法上，获取Cookie信息，用法和@RequestParam一致
	 * @param JSESSIONID
	 * @return
	 */
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(@CookieValue(value="JSESSIONID")String JSESSIONID){
//		System.out.println("JSESSIONID="+JSESSIONID);
//		return "success";
//	}
	
	/**
	 * 可以使用POJO获取客户端数据，要求实体类对象中的属性名一定要和页面中表单元素的name属性值一致，且支持级联关系
	 * 可以通过设置形参的方式，获取servlet api
	 * @param user
	 * @return
	 */
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(User user, HttpServletRequest request, HttpServletResponse response){
//		String username = request.getParameter("username");
//		System.out.println("User="+us er);
//		return "success";
//	}
	
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public ModelAndView param(){
//		ModelAndView mav = new ModelAndView();
////		在request作用域中设置值，即request.setAttribute("username","root");
//		mav.addObject("username", "root");
////		设置视图名称,实现页面跳转，即上面方法返回的success页面
//		mav.setViewName("success");
//		return mav;
//	}
	
	/**
	 * 向作用域中放值的第二种方式
	 * @param map
	 * @return
	 */
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(Map<String, Object> map){
//		map.put("username", "admin");//向request作用域中放值
//		return "success";//返回视图名称
//	}
	
	/**
	 * 向作用域中放值的第三种方式
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/param", method=RequestMethod.POST)
	public String param(Model model){
		model.addAttribute("username", "admin");//向request作用域中放值
		return "success";//返回视图名称
	}
	
	/**
	 * View作用：处理模型数据，实现页面跳转(转发，重定向)
	 * View类型：
	 * 	InternalResourceView: 转发视图
	 * 	JstlView: 转发视图
	 * 	RedirectView: 重定向视图
	 * @return
	 */
	@RequestMapping(value="/test1", method=RequestMethod.POST)
	public String test(String username){
		//重定向视图，打开index.jsp页面
//		return "redirect:/index.jsp";
		
		System.out.println(username);
		return "success";
	}
}
