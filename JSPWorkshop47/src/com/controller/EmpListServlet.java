package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDAO;
import com.dto.EmpDTO;
import com.dto.PageDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String curPage = request.getParameter("curPage");//현재 페이지 번호 얻기 
		if(curPage == null) curPage = "1";
		
		String searchName = request.getParameter("searchName");
		String searchValue = request.getParameter("searchValue");
		System.out.println(searchName+"\t"+searchValue);
		EmpService service = new EmpService();
		PageDTO pDTO = service.select(searchName, searchValue, Integer.parseInt(curPage));
		
		System.out.println(pDTO);
		
		
		
		
		request.setAttribute("pDTO", pDTO);
		request.setAttribute("searchName", searchName);
		request.setAttribute("searchValue", searchValue);
		
		//forward
		//화면전환 두가지 방법   :  화면전환전에 session.setAttribute("name", "홍길동"), request.setAttribute("passwd", "1234")
		//1. reponse.sendRedirect("XXX.jsp"): 화면 전환
		//    - xxx.jsp : session.getAttribute("name") : 사용가능 , request.getAttribute("passwd"): null- 사용불가 
		//     화면만 전환 시키고 ,  request에 저장된 값은 사용이 불가 
		//2. dispacter.forward(xxx.jsp)
		//    - xxx.jsp : session.getAttribute("name") : 사용가능 , request.getAttribute("passwd"): 사용가능 
		
		
		RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
		dis.forward(request, response);
		
	}

}
