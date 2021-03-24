package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/MemberRegiServlet")//주소 
public class MemberRegiServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userid=(String)request.getParameter("userid");
		String passwd=(String)request.getParameter("passwd");
		String email=(String)request.getParameter("email");
		
		HttpSession session = request.getSession();
		System.out.println(userid+"\t"+passwd+"\t"+email );
		if(userid!= null)session.setAttribute("userid", userid);
		//db저장 후 
		session.setAttribute("passwd", passwd);
		session.setAttribute("email", email);
		//회원가입 데이터 세션에 저장완료 - 로그인 인증에 활용 
		response.sendRedirect("loginForm.jsp");	
	
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
