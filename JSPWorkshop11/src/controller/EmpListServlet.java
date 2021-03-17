package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import static java.sql.DriverManager.getConnection;

@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

    String driver = "oracle.jdbc.driver.OracleDriver"; //드라이버
    String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속주소, sid
    String userid = "scott";//스키마 id
    String passwd = "tiger";//패스워드

    public void init(){
        try {
            Class.forName(driver);
            System.out.println("드라이버 로딩성공=======");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        PrintWriter out = response.getWriter();


        try {
            con = getConnection(url, userid, passwd);
            String sql = "select empno, ename, sal, to_char(hiredate, 'yyyy/mm/dd') hiredate, deptno from emp order by empno";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            System.out.println("잘 했엉");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        try {
            out.print("<head><body>");
            out.print("</body></head>");
            String my = "<table border='1'>";
            my += "<tr>";
            my += "<td>사원번호</td>";
            my += "<td>사원이름</td>";
            my += "<td>월급</td>";
            my += "<td>입사일</td>";
            my += "<td>부서번호</td>";
            my+="</tr>";
            my += "<tr>";
            my += "<td>" + rs.getInt("empno") + "</td>";
            my += "<td>" + rs.getString("ename") + "</td>";
            my += "<td>" + rs.getInt("sal") + "</td>";
            my += "<td>" + rs.getString("hiredate") + "</td>";
            my += "<td>" + rs.getInt("deptno") + "</td>";
            my += "</tr>";
            my += "</table>";
            out.print("</body>");
            out.print("</html>");
            out.print(my);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            try {
                if(rs!=null) rs.close();
                if(pstmt!=null) pstmt.close();
                if(con!=null) con.close();
            } catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }

    }
}
