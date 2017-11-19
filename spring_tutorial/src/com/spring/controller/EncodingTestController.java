package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/encodingTest")
public class EncodingTestController {

	/**
	 * 전송할 데이터를 입력할 페이지
	 * 
	 * @return
	 */
	@RequestMapping("/form")
	public ModelAndView form() {
		return new ModelAndView("/encodingTest/form");
	}
	
	/**
	 * 전송한 데이터를 확인할 페이지
	 * 
	 * @param request - 전송 텍스트
	 * @return
	 */
	@PostMapping("/view")
	public ModelAndView view(HttpServletRequest request) {
		String text = request.getParameter("text");
		return new ModelAndView("/encodingTest/view", "text", text);
	}
}
