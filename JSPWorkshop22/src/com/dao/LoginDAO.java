package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.dto.MemberDTO;

public class LoginDAO {

	public MemberDTO loginCheck(SqlSession session, MemberDTO dto) {
		MemberDTO m= session.selectOne("loginCheck", dto);
		System.out.println(m);
		return m;
	}
	
}
