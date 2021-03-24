package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String username = (String)session.getAttribute("username");
        String passwd=(String)session.getAttribute("passwd");

        System.out.println("getServlet username" + username + "\t" + passwd);
        if(username==null){
            response.sendRedirect("error.jsp");
        }else {
            response.sendRedirect("info2.jsp");
        }
    }
}
