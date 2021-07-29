package controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Command;
import service.DateCommandImpl;
import service.DateService;
import service.GreetingCommandImpl;
import service.GreetingService;
import service.InvalidService;
import service.InvaliddCommandImpl;

public class FrontController extends HttpServlet{

	private Map<String, Command> commands = new HashMap<String, Command>();
	//         요청(url), GreetingCommandImpl()
	// commands.put("/", new GreetingCommandImpl())
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// commands에 요청 문자열과 처리할 객체를 저장
		
		commands.put("/", new GreetingCommandImpl()); //    '/'
		commands.put("/greeting.do", new GreetingCommandImpl());
		commands.put("/date.do", new DateCommandImpl());
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 사용자의 요청을 분석 : URI를 추출해서 사용
		String commandUri = request.getRequestURI();
		// http://localhost8181/mvc/guest/list.do -> /mvc/guest/list.do
		if(commandUri.indexOf(request.getContextPath()) == 0) {
			commandUri = commandUri.substring(request.getContextPath().length());
		}
				
		// 결과 Data
		//Object resultObj = null;
		
		// view 페이지
		String viewPage = "/WEB-INF/views/default.jsp";
		Command command = null;
		
		command = commands.get(commandUri);
		if(command == null) {
			command = new InvaliddCommandImpl();
		}
		viewPage = command.getPage(request); 
		
		/*
		if(commandUri.equals("/greeting.do")) {
			command = new GreetingCommandImpl();
		} else if(commandUri.equals("/date.do")) {
			command = new DateCommandImpl();
		} else {
			command = new InvaliddCommandImpl();
		}
		*/
		
		
		
		
		
		// 2. 요청을 처리 : 모델 선택 실행 -> 요청을 처리할 수 있는 Service를 선택
		if(commandUri.equals("/greeting.do")) { // http://localhost:8080/mvc/greeting.do
			// 처리할 수 있는 서비스의 메소드 실행
			//resultObj = "안녕하세요";
			//viewPage = "/WEB-INF/views/greeting.jsp";
			GreetingService service = new GreetingService();
			viewPage = service.greeting(request);
			
		} else if(commandUri.equals("/date.do")){
			//resultObj = new Date();
			//viewPage = "/WEB-INF/views/date.jsp";
			DateService service = new DateService();
			viewPage = service.getDate(request);
			
		} else {
			//resultObj = "Invalid Type Request";
			InvalidService service = new InvalidService();
			viewPage = service.getPage(request);
		}
		
		// 3. 결과 데이터를 공유(전달)
		// request.setAttribute("result", resultObj);
		
		// 4. viewPage로 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
		
	}
}
