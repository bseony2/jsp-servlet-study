import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doget()");
        response.setContentType("utf-8");
        Map<String, String[]> map = request.getParameterMap();

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        Set<String> keys = map.keySet();
        for(String key : keys){
            String[] values = map.get(key);
            String mesg="";
            for (String s : values) {
                mesg+= s;
            }
            out.print(key + "========" + mesg + "<br>");
        }
        out.print("</body></html>");
    }
}
