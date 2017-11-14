package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		String msg = "Hello, World!";
		return new ModelAndView("hello", "msg", msg);
	}
	
}
