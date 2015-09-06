package com.ps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ps.mapper.BoardMapper;
import com.ps.service.BoardService;
import com.ps.vo.Board;

//dao class(db?‘?—…?•˜?Š” ?´?˜?Š¤) --> select, insert, delete...
//java Mapper(CustomerMapper.java)ë¥? ?´?š©?•´?„œ ?‘?—…
@Component("ps4")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper mapper;

	@Override
	public List<Board> all() {
		// TODO Auto-generated method stub
		return mapper.all();
	}

	@Override
	public void insert(Board p) {
		mapper.insert(p);
		
	}



}
	


