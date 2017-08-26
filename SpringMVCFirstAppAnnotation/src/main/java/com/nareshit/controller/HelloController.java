package com.nareshit.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nareshit.bean.User;
import com.nareshit.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController{
	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public ModelAndView sayHello(@ModelAttribute("user1") User user1) {
		String targetView="/WEB-INF/pages/welcome.jsp";
		ModelAndView model=new ModelAndView(targetView);
		model.addObject("test","jayashree");
		return model;
		
		/*msg=helloService.sayHello(name);
		return new ModelAndView(targetView,"msg",msg);adsfsfsdfsj*/
	}

}
