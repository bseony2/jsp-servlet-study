package com.dao;

import com.dto.EmpDTO;
import org.apache.ibatis.session.SqlSession;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

    public List<EmpDTO> select(SqlSession session){
        List<EmpDTO> list = session.selectList("com.dto.selectAll");

        return list;
    }










//    public ArrayList<EmpDTO> selectAllEmp(Connection con){
//
//        ArrayList<EmpDTO> list = new ArrayList<>();
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        System.out.println("=======================");
//        System.out.println("this is DAO");
//        System.out.println("=======================");
//        try {
//            String sql = "select empno, ename, job, mgr, to_char(hiredate, 'YYYY-MM-DD'hiredate, sal, comm,deptno from emp order by 1";
//            pstmt = con.prepareStatement(sql);
//            rs = pstmt.executeQuery();
//            while (rs.next()){
//                int empno = rs.getInt("empno");
//                String ename = rs.getString("ename");
//                String job = rs.getString("job");
//                int mgr = rs.getInt("mgr");
//                String hiredate = rs.getString("hiredate");
//                double sal = rs.getDouble("sal");
//                double comm = rs.getDouble("comm");
//                int deptno = rs.getInt("deptno");
//                EmpDTO notice = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
//                list.add(notice);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }finally {
//            try {
//                if(rs!=null) rs.close();
//                if(pstmt!=null) pstmt.close();
//                if(con!=null) con.close();
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//        }
//        return list;
//    }
}
