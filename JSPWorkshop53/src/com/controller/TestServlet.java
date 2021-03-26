package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.EmpDTO;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(1000);
		dto.setEname("홍길동");
		dto.setSal(5000);
		
		EmpDTO dto2 = new EmpDTO();
		dto2.setEmpno(1100);
		dto2.setEname("이순신");
		dto2.setSal(4500);

		 ArrayList<EmpDTO> list = new ArrayList<>();
		 list.add(dto);
		 list.add(dto2);
		 
		 request.setAttribute("list", list);
		
		 RequestDispatcher dis = request.getRequestDispatcher("info.jsp");
		 dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
