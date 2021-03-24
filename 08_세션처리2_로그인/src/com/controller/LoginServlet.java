package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String userid=(String)request.getParameter("userid");//로그인에서 
		String passwd=(String)request.getParameter("passwd");
		
		
		String sessid=(String)session.getAttribute("userid");//세션에서 
		String sesspw=(String)session.getAttribute("passwd");
		
		String mesg="";
		String nextPage="";		
	if(userid.equals(sessid)&&passwd.equals(sesspw)) {
		System.out.println("인증완료");
		nextPage="loginInfo.jsp";
		mesg="환영합니다.";
		
	}else {//인증오류
		nextPage="error.jsp";
		mesg="아디/비번오류";
		
	}
	request.setAttribute("mesg", mesg);		
	RequestDispatcher dis= request.getRequestDispatcher(nextPage);
	dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
