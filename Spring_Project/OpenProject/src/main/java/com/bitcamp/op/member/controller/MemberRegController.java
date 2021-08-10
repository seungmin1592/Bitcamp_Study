package com.bitcamp.op.member.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.op.member.domain.MemberRegRequest;
import com.bitcamp.op.member.service.MemberRegService;
import com.bitcamp.op.member.service.RegService;

@Controller
@RequestMapping("/member/memberReg")
public class MemberRegController {
	

	@Autowired
	private MemberRegService regService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String RegForm() {
		
		return "member/regForm";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String Reg(
			@ModelAttribute("regRequest") MemberRegRequest regRequest,
			HttpServletRequest request,
			Model model
			) {
		
		int result = regService.memberReg(regRequest, request);
		//System.out.println(regReregService.memberReg(regRequest, request)quest);
		model.addAttribute("result", result);
		
		String view = "member/reg";
		
		if(result == 1) {
			// 인덱스 페이지로 리다이렉트
			view = "redirect:/index";
		}
		
		return view;
	}
	
	
	
	
	
}
