package com.spring.intl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeCtrl {

	@RequestMapping(value= "/init", method= RequestMethod.GET)
	public ModelAndView initView(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(" Successdully running.");

		ModelAndView modelview = new ModelAndView();
		modelview.addObject("welcome_msg", " Internationalization MVC");		
		modelview.setViewName("welcome");
		return modelview;
	}
}