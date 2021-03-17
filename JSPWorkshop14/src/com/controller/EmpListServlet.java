package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.StudentDTO;
import com.service.MyBatisService;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 MyBatisService service = new MyBatisService();
		 List<StudentDTO> list = service.selectAllStudent();
		
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		String my = "<table border='1'>";
		   my += "<tr>";
		   my += "<td>학번</td>";
		   my += "<td>학과번호</td>";
		   my += "<td>이름</td>";
		   my += "<td>주민번호</td>";
		   my += "<td>주소</td>";
		   my += "<td>입학년도</td>";
		   my += "<td>휴학여부</td>";
		   my += "</tr>";
		for(StudentDTO dto : list){
			my += "<tr>";
			   my += "<td>"+dto.getStuNo()+"</td>";
			   my += "<td>"+dto.getDepartNo()+"</td>";
			   my += "<td>"+dto.getStuName()+"</td>";
			   my += "<td>"+dto.getStuSsn()+"</td>";
			   my += "<td>"+dto.getStuAddress()+"</td>";
			   my += "<td>"+dto.getEntDate()+"</td>";
			   my += "<td>"+dto.getAbsYn()+"</td>";
			   my += "</tr>";
		}
		   my += "</table>";
		   out.print(my);
		   out.print("</body>");
		   out.print("</html>");
	}

}
