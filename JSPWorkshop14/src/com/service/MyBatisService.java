package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MyBatisDAO;
import com.dto.StudentDTO;

public class MyBatisService {

	private MyBatisDAO dao;
	
	public MyBatisService() {
	   dao = new MyBatisDAO();
	}

	public List<StudentDTO> selectAllStudent(){
		
		SqlSession session = MySqlSessionFactory.getSession();
		List<StudentDTO> list = null;
		try {
			list = dao.selectAllStudent(session);
		}finally {
			session.close();
		}
		 return list;
	}
}
