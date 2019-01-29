package com.znsd.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.znsd.service.StudentService;


@Controller
public class StudentAction {
	
/*	@Autowired
	private StudentService service;
*/
	@RequestMapping("/index")
	public String login() {
		System.out.println("你好---我是！");
		return "login";
	}
	
}
