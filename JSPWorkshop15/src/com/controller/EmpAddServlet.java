package com.controller;

import com.dto.EmpDTO;
import com.service.EmpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

@WebServlet("/EmpAddServlet")
public class EmpAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        EmpDTO dto = new EmpDTO();

        dto.setEmpno(Integer.parseInt(request.getParameter("empno")));
        dto.setEname(request.getParameter("ename"));
        dto.setJob(request.getParameter("job"));
        dto.setMgr(Integer.parseInt(request.getParameter("mgr")));
        dto.setSal(Double.parseDouble(request.getParameter("sal")));

        System.out.println(dto);


        EmpService service = new EmpService();
        int n = service.memberAdd(dto);
        System.out.println("insert n=======" + n);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        if (n == 1) {
            out.print("회원가입 성공");
        } else {
            out.print("회원가입실패");
        }
        out.print("<a href='EmpListServlet'>회원목록보기</a>");
        out.print("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
