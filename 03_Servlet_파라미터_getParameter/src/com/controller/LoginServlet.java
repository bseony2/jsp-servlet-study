package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8"); //request 한글처리 post에서 필요

        System.out.println("LoginServlet.doGet()==================");
        String user_id = request.getParameter("userid");
        String user_pswd = request.getParameter("passwd");
        System.out.println(user_id + "====" + user_pswd);

        //응답처리

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        out.print("이름은:"+user_id);
        out.print("비번은:"+user_pswd);
        out.print("</html></body>");


    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
