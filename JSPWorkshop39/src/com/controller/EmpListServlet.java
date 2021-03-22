package com.controller;

import com.dto.EmpDTO;
import com.service.EmpService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //select 요청, 데이터 request에 담아 view페이지에 전송
        EmpService service = new EmpService();
        List<EmpDTO> list = service.select();

        request.setAttribute("list", list);

        RequestDispatcher dis = request.getRequestDispatcher("list.jsp"); //포워딩 페이지 지정
        dis.forward(request, response); //request , response 위임, request에는 데이터가 같이 전달
        //forward명령이 실행되며 페이지가 list.jsp로 바뀜
        //list.jsp의 역할 : request.getAttribute("list") => 콘솔에 출력
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
