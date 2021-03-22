import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "GetScopeServlet")
public class GetScopeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        ServletContext ctx = getServletContext();

        String x = (String)request.getAttribute("request");
        String x2 = (String)session.getAttribute("session");
        String x3 = (String)ctx.getAttribute("application");

        System.out.println("request" + x);
        System.out.println("session" + x2);
        System.out.println("application" + x3);
    }
}
