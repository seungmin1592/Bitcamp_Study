package com.bitcamp.op.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.op.member.service.RegService;

@Controller
@RequestMapping("/member/reg")
public class RegController {

	@Autowired
	private RegService regService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String RegForm() {
		
		return "member/regForm";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String Reg(HttpServletRequest request) {
		
		regService.regMember(request);

		return "member/regView";
	}
	
	
	
	
	
}
