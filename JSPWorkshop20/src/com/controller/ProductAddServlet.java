package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

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
@WebServlet("/ProductAddServlet")
public class ProductAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		int amount = Integer.parseInt(request.getParameter("amount"));
		//파싱 
		//
		HttpSession session = request.getSession();
        Product p  = (Product)session.getAttribute(id);//id로 세션에서 객체 얻기 
		
	        if(p == null ) {//데이터 가 없음 
				p=new Product(name, id, amount);//새로운 product 생성 
				session.setAttribute(id, p);//세션에 추가 
			}else{//기존 객체의 수량만 증가 
				p.setAmount(p.getAmount()+amount);
			}  
	        request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();			
			out.println("<html><body>");
			out.println("<h2>상품 등록 성공</h2>");
			out.println("<a href='productForm.html'>등록화면보기</a><br>");
			out.println("<a href='ProductListServlet'>상품목록보기</a><br>");
			out.println("</body></html>");
			
	  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
