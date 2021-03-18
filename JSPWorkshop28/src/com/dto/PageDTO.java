package com.dto;

import java.util.List;

public class PageDTO {
	private List<StudentDTO> list;
	int curPage; //현재 페이지번호
	int perPage=3; //페이지당 목록수
	int totalCount; //전체 목록수
	
	public PageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PageDTO(List<StudentDTO> list, int curPage, int perPage, int totalCount) {
		super();
		this.list = list;
		this.curPage = curPage;
		this.perPage = perPage;
		this.totalCount = totalCount;
	}

	public List<StudentDTO> getList() {
		return list;
	}

	public void setList(List<StudentDTO> list) {
		this.list = list;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	@Override
	public String toString() {
		return "PageDTO [list=" + list + ", curPage=" + curPage + ", perPage=" + perPage + ", totalCount=" + totalCount
				+ "]";
	}
	

}
