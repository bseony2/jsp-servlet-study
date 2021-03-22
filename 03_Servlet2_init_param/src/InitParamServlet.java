import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "InitParamServlet")
public class InitParamServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("InitParamServlet.doGet");
        String userid = getInitParameter("userid");
        String email = getInitParameter("email");
        System.out.println(userid + "\t" + email);

        Enumeration<String> enu = getInitParameterNames();
        while(enu.hasMoreElements()){
            String key = enu.nextElement();
            String value = getInitParameter(key);
            System.out.println(">>>" + key + "\t" + value);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
