package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.StudentDAO;
import com.dto.PageDTO;
import com.dto.StudentDTO;

public class StudentService {

	private StudentDAO dao;
	
	public StudentService() {
	   dao = new StudentDAO();
	}

	public PageDTO selectAllStudent(int curPage){
		
		SqlSession session = MySqlSessionFactory.getSession();
		PageDTO pdto = null;
		try {
			pdto = dao.selectAllStudent(session, curPage);
		}finally {
			session.close();
		}
		 return pdto;
	}
}
