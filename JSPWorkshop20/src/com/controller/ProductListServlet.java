package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;

/**
 * Servlet implementation class ProductAddServlet
 */
@WebServlet("/ProductListServlet")
public class ProductListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 HttpSession session = request.getSession();//세션얻기 
		 Enumeration<String> keys= session.getAttributeNames();//key값만 Enumeration으로 얻기
			 request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();			
			out.println("<html><head><title>상품입력결과</title></head><body>");
			out.println("<b>상품입력 결과</b><hr/>");	
			String my = "<table border='1'>";
			   my += "<tr>";
			   my += "<td>상품 아이디</td>";
			   my += "<td>상품명</td>";
			   my += "<td>갯수</td>";
			   my += "</tr>";
			while(keys.hasMoreElements()) {
				String id = keys.nextElement();//키값 하나 얻기 상품의 id값 
				Product p =(Product)session.getAttribute(id);//key인 id를 이용하여 세션에서 
				//객체 하나 얻기 				
				   my += "<tr>";
				   my += "<td>"+p.getId()+"</td>";
				   my += "<td>"+p.getName()+"</td>";
				   my += "<td>"+p.getAmount()+"</td>";
				   my += "</tr>";
			}
			   my += "</table>";			   
			out.print(my);			
			out.println("<a href='productForm.html'>등록화면보기</a><br>");
			out.println("</body></html>");
			
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
