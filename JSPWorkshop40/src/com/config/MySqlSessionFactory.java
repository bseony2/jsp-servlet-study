package com.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MySqlSessionFactory {
	private static SqlSessionFactory sqlSessionFactory = null;
	static {
		System.out.println("스택틱 부분 ===========================================================");
		String resource = "com/config/Configuration.xml";
		InputStream inputStream=null;
		try {
			System.out.println("트라이===============================================");
			inputStream = Resources.getResourceAsStream(resource);
			System.out.println("트라이 맨 아래=============================================");

		} catch (IOException e) {
			System.out.println("캐치==============================================");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}//end static

	public static SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}



}//end class

