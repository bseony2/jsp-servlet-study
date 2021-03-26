package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 request.setAttribute("request", "홍길동");
		 HttpSession session = request.getSession();
		 session.setAttribute("session", "이순신");
		 
		 ServletContext ctx = getServletContext();
		 ctx.setAttribute("application", "유관순");
		 
		 
		 RequestDispatcher dis = request.getRequestDispatcher("info.jsp");
		 //EL태그 사용, 일반 JSP 태그로도 뽑아서 동일한 출력 
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
