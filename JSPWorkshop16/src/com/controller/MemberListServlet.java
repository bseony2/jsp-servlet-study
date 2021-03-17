package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MemberListServlet")
public class MemberListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //세션생성성
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("user");
        System.out.println(username);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        if (username == null) {
            out.print("잘못 접근, 회원등록후 조회 가능");
        } else {
            out.print("세션에 등록된 이름인 : " + username + "<br>");
        }
        out.print("<a href='member.html'>회원등록화면</a>");
        out.print("</body></html>");
    }
}
