import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SetScopeServlet")
public class SetScopeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("request", "홍길동");

        HttpSession session = request.getSession();
        session.setAttribute("session", "이순신");
        System.out.println("SetServlet session setting sess : 이순신");
        System.out.println(session.getAttribute("sss"));

        ServletContext ctx = getServletContext();
        ctx.setAttribute("application", "유관순");

        System.out.println("request : 홍길동");
        System.out.println("session : 이순신");
        System.out.println("application : 유관순");

    }
}
