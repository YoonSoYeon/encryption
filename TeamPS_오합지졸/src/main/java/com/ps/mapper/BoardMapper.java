package com.ps.mapper;


import java.util.List;

import com.ps.vo.Board;

//for impl
public interface BoardMapper {
	public List<Board> all();//모든 ?��코드
	public void insert(Board p);
	
}
	