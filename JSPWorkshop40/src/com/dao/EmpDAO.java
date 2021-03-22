package com.dao;

import com.dto.EmpDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmpDAO {
	

	public List<EmpDTO> select(SqlSession session) {
		List<EmpDTO> list =  session.selectList("com.dto.selectAll");
		return list;
	}
	
	
	
	
}
