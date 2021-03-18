package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.PageDTO;
import com.dto.StudentDTO;
import com.service.StudentService;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/StudentListServlet")
public class StudentListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//현채페이지 설정 
		String curPage= request.getParameter("curPage");
		if(curPage==null) {
			curPage="1";
		}
		 StudentService service = new StudentService();
		 PageDTO pdto = service.selectAllStudent(Integer.parseInt(curPage));//읽어올페이지 넘기기 
		
		 List<StudentDTO> list = pdto.getList();//학생목록얻기
		 int perPage= pdto.getPerPage();
		 int totalCount= pdto.getTotalCount();
		 int totalPage= totalCount/perPage;
		 if(totalCount%perPage !=0) totalPage++;
		 System.out.println("totalCount>>"+ totalCount);
		 System.out.println("totalPaget>>"+ totalPage);
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
	my+="<tr><td colspan='6'>";
	for (int i = 1; i <= totalPage; i++) {
		if(i==Integer.parseInt(curPage)) {
			my+="<span style='color:red'>"+ i +"</span>&nbsp;&nbsp;";
		}else {
			my+= "<a href='StudentListServlet?curPage="+i+"'>"+ i +"</a>&nbsp;&nbsp;";
		}
		
	}
	my+="</td></tr>";
		   my += "</table>";
		   out.print(my);
		   out.print("</body>");
		   out.print("</html>");
	}

}
