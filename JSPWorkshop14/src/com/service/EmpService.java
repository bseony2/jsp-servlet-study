package com.service;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmpService {

    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String userid = "scott";
    String passwd = "tiger";
    EmpDAO dao;

    public EmpService(){
        dao = new EmpDAO();
        try {
            Class.forName(driver);
            System.out.println("service 드라이버 로딩성공");
        }catch (ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
    }

    public List<EmpDTO> select(){
        SqlSession session = MySqlSessionFactory.getSession();
        List<EmpDTO> list = null;
        try{
            list = dao.select(session);
        }finally {
            session.close();
        }
        return list;
    }





//    public ArrayList<EmpDTO> selectAllEmp(){
//        ArrayList<EmpDTO> list = null;
//        Connection con = null;
//        try {
//            con = getConnection(url, userid, passwd);
//            list = dao.selectAllEmp(con);
//        }catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }finally {
//            try {
//                if(con!=null) con.close();
//            }catch (SQLException e2){
//                e2.printStackTrace();
//            }
//        }
//        return list;
//    }
}
