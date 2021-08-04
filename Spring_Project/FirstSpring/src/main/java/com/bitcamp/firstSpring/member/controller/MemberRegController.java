package com.bitcamp.firstSpring.member.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.firstSpring.member.domain.MemberRegRequest;

@Controller
@RequestMapping("/member/memberReg")
public class MemberRegController {

	@RequestMapping(method = RequestMethod.GET)
	public String getRegForm() {
		
		return "member/memberRegForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String regForm(
			@RequestParam(value = "memberid", required = false) String memberid,
			@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "membername", required = false) String membername,
			HttpServletRequest request,
			@ModelAttribute("regRequest") MemberRegRequest regRequest,
			Model model
			
			) {
		
		model.addAttribute("memberid", memberid);
		model.addAttribute("password", password);
		model.addAttribute("membername", membername);
		
		model.addAttribute("memberName", request.getParameter("membername"));
		model.addAttribute("memberPassword", request.getParameter("password"));
		model.addAttribute("memberId", request.getParameter("memberid"));
		
		
		return "member/memberReg";
	}
}
