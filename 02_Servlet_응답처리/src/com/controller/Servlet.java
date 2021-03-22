package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //응답처리 step 1.response 컨텐츠 타입설정 text/html;charset=UTF-8
        response.setContentType("text/html;charset=UTF-8");
        //응답처리 step 2. response에서 문자열을 보낼 수 있는 PrintWrite 객체 획득
        PrintWriter out = response.getWriter();
        //응답처리 step 3. printWriter out.print함수 사용 html문서를 만들어 주기
        out.print("<html><body>");
        out.print("<h1>서블릿 응답처리 실습</h1>");
        out.print("<p>Hello World</p>");
        out.print("<b/body></html>");
//      응답처리 마지막 out.print에 담긴 태그가 사용자 브라우저로  response되고 브라우저에서 출력
    }
}
