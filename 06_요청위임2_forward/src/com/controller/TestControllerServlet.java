package com.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/TestControllerServlet")
public class TestControllerServlet extends HttpServlet {
    private  static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("TestController.doGet");
        request.setAttribute("request", "홍길동");
        HttpSession session = request.getSession();
        session.setAttribute("session", "이순신");
        ServletContext ctx = getServletContext();
        ctx.setAttribute("application", "유관순");

        response.sendRedirect("hello.jsp");
    }
}
