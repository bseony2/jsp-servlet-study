package com.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.PageDTO;
import com.dto.StudentDTO;

public class StudentDAO {
	public int totalCount(SqlSession session) {
		return session.selectOne("totalcount");
	}

	public PageDTO selectAllStudent(SqlSession session, int curPage){
		
		PageDTO pdto= new PageDTO();
		int perPage=10;
		int offset=(curPage-1)*perPage;
		List<StudentDTO> list = session.selectList("selectAllStudent", null, new RowBounds(offset,perPage));
		pdto.setCurPage(curPage);
		pdto.setPerPage(perPage);
		pdto.setTotalCount(totalCount(session));
		pdto.setList(list);
		
		return pdto;
	}
}
