package control;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet("/ProductRegistrationServlet")
public class ProductRegistrationServlet extends HttpServlet {

    HashMap<String, Product> products = new HashMap<String, Product>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");



        String name = request.getParameter("name");
        String id = request.getParameter("id");
        int amount = Integer.parseInt(request.getParameter("amount"));

        Product product = new Product(name, id, amount);
        products.put(product.getId(), product);
        PrintWriter out = response.getWriter();

        out.print("<head><body>");

        out.print("<table border=1>");
        out.print("<tr>");
        out.print("<td>상품명</td>");
        out.print("<td>상품아이디</td>");
        out.print("<td>상품수량</td>");
        out.print("</tr>");


        for (Product p : products.values()){
            out.println("<tr>");
            out.print("<td>" + p.getName() + "</td><td>" + p.getId() + "</td><td>" + p.getAmount() + "</td>");
            out.println("</tr>");
        }

        out.print("</table>");
        out.print("</body></head>");
        out.print("<a href='productForm.html'>상품입력하기</a>");
    }
}
