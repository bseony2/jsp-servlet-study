import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/member")
public class member extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("username");
        String ssn = request.getParameter("ssn");

        String gender=(ssn.substring(7,8)).equals("1")?"남자":"여자";
        String[] hobbys = request.getParameterValues("hobby");
        String marry = request.getParameter("marry");


        PrintWriter out = response.getWriter();

        out.print("<head><body>");
        out.print(name + "<br>");
        out.print(ssn + "<br>");
        out.print("gender : " + gender + "<br>");
        for (String hobby : hobbys) {
            out.print(hobby + "<br>");
        }
        out.print(marry + "<br>");
        out.print("</body></head>");


        System.out.println(name + "\t" + ssn);
        System.out.println(gender);
        System.out.println(marry);

    }
}
