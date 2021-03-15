package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.geom.CubicCurve2D;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    int num;
    ArrayList<String> list = new ArrayList<String>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int size = 10;
        num++;
        list.add("홍길동");
        System.out.println("doGet" + num);
        System.out.println("doGet" + list);
        System.out.println("doget  size="+size);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
