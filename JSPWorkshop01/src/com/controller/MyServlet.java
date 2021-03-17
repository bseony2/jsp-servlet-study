package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        out.print("<html><body>");

        out.print("<table border='1'>");

        out.print("<tr>");
        out.print("<td>이름</td>");
        out.print("<td>나이</td>");
        out.print("<td>주소</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>홍길동</td>");
        out.print("<td>26</td>");
        out.print("<td>부천</td>");
        out.print("</tr>");


        out.print("</table>");
        System.out.println("LoginServlet 데이터 전송완료");

    }
}
