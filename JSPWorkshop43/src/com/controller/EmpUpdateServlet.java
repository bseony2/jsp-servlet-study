package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EMPInsertServlet
 */
@WebServlet("/EmpUpdateServlet")
public class EmpUpdateServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String empno = request.getParameter("empno");
		String job = request.getParameter("job");
		String sal = request.getParameter("sal");
		
		
		
		

			EmpDTO dto = new EmpDTO();
			dto.setEmpno(Integer.parseInt(empno));
			dto.setJob(job);
			dto.setSal(Integer.parseInt(sal));
			
			EmpService biz = new EmpService();
			int n= biz.update(dto);//업데이트 완료   mapper id = update
			System.out.println(n );			
		   response.sendRedirect("EmpListServlet");//리스트 출력 
		 //   response.sendRedirect("EmpRetrieveServlet?empno="+ dto.getEmpno());//직원 상세보기로 이동
		    
	}//end doPost
}//end class
