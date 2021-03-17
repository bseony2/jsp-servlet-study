package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");


        System.out.println(username);
//      세션 생성
        HttpSession session = request.getSession();
        session.setAttribute("user", username);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        out.print("<h2>세션에 이름 저장 성공</h2>");
        out.print("<a href='MemberListServlet'>세션정보 보기</a>");
        out.print("</body></html>");

    }
}
