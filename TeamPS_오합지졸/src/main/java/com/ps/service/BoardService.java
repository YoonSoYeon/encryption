package com.ps.service;

import java.util.List;

import com.ps.vo.Board;
//for app
public interface BoardService {
	
	public List<Board> all();//모든 ?��코드
	public void insert(Board p);
}
