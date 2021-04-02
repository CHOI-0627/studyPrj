package com.newlec.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//extends Http.... 이렇게 하면 servlet처럼 사용되는것 
//이러한 기능을 library - Maven Dependencies - spring-webmvc...jar 에서 DispatcherServlet.class 그역활을 함 

public class IndexController implements Controller{
	
	//controller에서 ModelAndView 를 다시 Dispatcher 로 forwarding,, model를 .jsp로  보내면 .jsp에서 출력
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mv = new ModelAndView("root.index");
		mv.addObject("data", "Hello Spring MVC");
		//mv.setViewName("/WEB-INF/view/index.jsp");
		
		return mv;
	} 

}
