package com.service;

import com.dao.EmpDAO;
import com.dto.EmpDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.EmpDAO;

import static java.sql.DriverManager.getConnection;

public class EmpService {

    String driver = "oracle.jdbc.driver.OracleDriver"; //드라이버
    String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속주소, sid
    String userid = "scott";//스키마 id
    String passwd = "tiger";//패스워드
    EmpDAO dao;

    public EmpService(){
        super();
        try {
            Class.forName(driver);
            System.out.println("service 드라이버 로딩성공");
        }catch (ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
        dao = new EmpDAO();
    }

    public ArrayList<EmpDTO> selectAllEmp(){
        ArrayList<EmpDTO> list = null;
        Connection con = null;
        try {
            con = getConnection(url, userid, passwd);
            list = dao.selectAllEmp(con);
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if(con!=null) con.close();
            }catch (SQLException e2){
                e2.printStackTrace();
            }
        }
        return list;
    }
}
