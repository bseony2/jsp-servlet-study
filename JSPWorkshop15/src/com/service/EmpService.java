package com.service;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmpService {
    EmpDAO dao;

    public EmpService(){
        dao = new EmpDAO();
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

    public int memberAdd(EmpDTO dto){
        SqlSession session = MySqlSessionFactory.getSession();
        int num=0;
        try {
            num = dao.memberAdd(session, dto);
            session.commit();
        }finally {
            session.close();
        }
        return num;

    }

}
