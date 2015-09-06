package com.ps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ps.mapper.GIPSMapper;
import com.ps.mapper.PSMapper;
import com.ps.service.GIPSService;

import com.ps.service.PSService;
import com.ps.vo.GIPS;
import com.ps.vo.PS;
//dao class(db?ûë?óÖ?ïò?äî ?Å¥?ûò?ä§) --> select, insert, delete...
//java Mapper(CustomerMapper.java)Î•? ?ù¥?ö©?ï¥?Ñú ?ûë?óÖ
@Component("ps2")
public class GIPSServiceImpl implements GIPSService {
	
	@Autowired
	GIPSMapper mapper;



	@Override
	public List<GIPS> all() {
		// TODO Auto-generated method stub
		return mapper.all();
	}


	@Override
	public GIPS findByNum(String gnum) {
		// TODO Auto-generated method stub
		return mapper.findByNum(gnum);
	}



	@Override
	public void ginfoinsert(GIPS p) {
		// TODO Auto-generated method stub
		mapper.ginfoinsert(p);
	}





}
	


