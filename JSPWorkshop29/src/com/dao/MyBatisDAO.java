package com.dao;

import com.dto.StudentDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyBatisDAO {

	public List<StudentDTO> selectAllStudent(SqlSession session){
		
		List<StudentDTO> list = session.selectList("selectAllStudent");
		
		return list;
	}
}
