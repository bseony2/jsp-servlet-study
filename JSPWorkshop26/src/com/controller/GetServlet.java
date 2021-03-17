package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetServlet")
public class GetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String req = (String)request.getAttribute("request");

        HttpSession session = request.getSession();
        String sess = (String)session.getAttribute("session");

        String app = (String)getServletContext().getAttribute("application");

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        out.print("<html><body>");
        out.print("홍길동 출력 : " + req + "<br>");
        out.print("이순신 출력 : " + sess + "<br>");
        out.print("유관순 출력 : " + app + "<br>");
        out.print("</body></html>");
    }
}
