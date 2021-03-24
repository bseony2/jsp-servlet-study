package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SetServlet")
public class SetServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. session 얻기 서블릿에서 세션 사용시 세션을 얻기 먼저 실행
        HttpSession session = request.getSession();
        //2. 공유데이터 저장(사용자 사용하는 브라우저간의 공유 데이터
        session.setAttribute("username", "홍길동");
        session.setAttribute("passwd", "1234");
        response.sendRedirect("info.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
