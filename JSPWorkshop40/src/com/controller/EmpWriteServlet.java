package com.controller;

import com.dto.EmpDTO;
import com.service.EmpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EmpWriteServlet")
public class EmpWriteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String empno = request.getParameter("empno");
        String ename = request.getParameter("ename");
        String job = request.getParameter("job");
        String mgr = request.getParameter("mgr");
        String sal = request.getParameter("sal");

        EmpDTO dto = new EmpDTO(Integer.parseInt(empno), ename, job, Integer.parseInt(mgr), null, Integer.parseInt(sal), 0, 0);
        EmpService service = new EmpService();
        service.insert(dto);
        int n = service.insert(dto);
        if(n==1){
            response.sendRedirect("EmpListServlet");
        }

        response.sendRedirect("EmpListServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
