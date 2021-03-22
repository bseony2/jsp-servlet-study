package com.service;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmpService {
	

	public List<EmpDTO> select() {
	 EmpDAO dao = new   EmpDAO();
	 SqlSession session = MySqlSessionFactory.getSession();
	 List<EmpDTO> list = null; 
	 try {
     list = dao.select(session);
    	  
//      }catch(Exception e) {
//    	  e.printStackTrace();
      }finally {
		session.close();
      }
      return list;
	}//end select


	public int insert(EmpDTO dto) {
		return 0;
	}
}
