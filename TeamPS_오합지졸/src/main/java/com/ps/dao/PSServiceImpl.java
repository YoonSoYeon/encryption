package com.ps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ps.mapper.PSMapper;
import com.ps.service.PSService;
import com.ps.vo.GPS;
import com.ps.vo.PS;
//dao class(db?ûë?óÖ?ïò?äî ?Å¥?ûò?ä§) --> select, insert, delete...
//java Mapper(CustomerMapper.java)Î•? ?ù¥?ö©?ï¥?Ñú ?ûë?óÖ
@Component("ps")
public class PSServiceImpl implements PSService {
	
	@Autowired
	PSMapper mapper;

	@Override
	public List<PS> all() {
		return mapper.all();
	}

	@Override
	public void insert(PS c) {
		mapper.insert(c);
		
	}

	@Override
	public PS findByNum(String num) {
		return mapper.findByNum(num);
	}

	@Override
	public List<PS> findByTitle(String title) {
		return mapper.findByTitle("%"+title+"%");
	}

	@Override
	public List<PS> findByName(String name) {
		return mapper.findByName(name);
	}

	@Override
	public void delete(String num) {
		mapper.delete(num);		
	}

	@Override
	public void update(PS b) {
		mapper.update(b);		
	}



}




