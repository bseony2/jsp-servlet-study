package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import com.dto.EmpDTO;
import com.dto.PageDTO;

public class EmpDAO {
	
	public int totalCount(SqlSession session,HashMap<String, String> map) {
		return session.selectOne("com.dto.totalCount",map);
	}

	public PageDTO select(SqlSession session , HashMap<String, String> map, int curPage) {
	
		PageDTO pDTO = new PageDTO();
		int perPage = pDTO.getPerPage();//PageDTO perpage=2
		int offset = (curPage - 1) * perPage;
		System.out.println(curPage);
		System.out.println(perPage);
		System.out.println(map);
		List<EmpDTO> list =  session.selectList("com.dto.selectAll" , map , new RowBounds(offset, perPage));
		//"id", map("searchName", "searchValue")-검색관련 key/value, RowBounds(시작, 몇개?)
		/////////////////////////////////////////////////////////////////////
		pDTO.setCurPage(curPage);//현재 페이지 저장
		pDTO.setList(list);//리스트 저장 
		pDTO.setTotalCount(totalCount(session,map));//검색어도 넘겨서 검색에 관련 전체 레코드 갯수 구하기 
		///////////////
		return pDTO;
	}
	
	public int insert(SqlSession session, EmpDTO dto) {
		int n =  session.insert("com.dto.insert" , dto );
		return n;
	}
	
	public EmpDTO retrieve(SqlSession session, int empno) {
		EmpDTO dto =  session.selectOne("com.dto.selectByEmpno" , empno);
		return dto;
	}
	
	public int update(SqlSession session, EmpDTO dto) {
		int n =  session.update("com.dto.update" , dto );
		return n;
	}
	
	public int delete(SqlSession session, int empno) {
		int n =  session.delete("com.dto.delete" , empno );
		return n;
	}
	
	public List<EmpDTO> order(SqlSession session , HashMap<String, String> map) {
		List<EmpDTO> list =  session.selectList("com.dto.order" , map);
		return list;
	}
	

	
	
}
