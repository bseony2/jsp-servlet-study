package example;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class Servlet extends HttpServlet {
    private  static final long serialVersionUID=1L;

    public Servlet(){
        super();
        System.out.println("생성자호출==========");
    }

    public void init(ServletConfig config) throws ServletException{
        System.out.println("init 메서드");
    }

    public void destroy(){
        System.out.println("destroy 메서드드");
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("served at:").append(request.getContextPath());
        System.out.println("hello");
    }


}