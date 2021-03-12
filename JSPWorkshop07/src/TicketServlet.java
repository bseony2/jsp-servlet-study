import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TicketServlet")
public class TicketServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        String birthday = request.getParameter("birthday");
        int birth = Integer.parseInt(birthday.substring(2, 4));
        System.out.println(birth);
        birth = birth > 21 ? 100-(birth - 21)+1 : 21-birth;
        int ticket = Integer.parseInt(request.getParameter("type"));
        int price = 0;
        if (birth<19) price = ticket * 6 / 10;
        else if (birth<60) price = ticket * 9 / 10;
        else price = ticket * 5 / 10;

        PrintWriter out = response.getWriter();
        out.print("<head><body>");
        out.print("생년월일 : " + birthday + "<br>");
        out.print("티켓 가격 : " + price);
        out.print("</body></head>");

    }
}
