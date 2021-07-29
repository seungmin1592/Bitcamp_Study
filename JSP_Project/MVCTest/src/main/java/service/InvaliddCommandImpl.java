package service;

import javax.servlet.http.HttpServletRequest;

public class InvaliddCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request) {
		
		// 핵심 처리...
		
		return "/WEB-INF/views/default.jsp";
	}

}
