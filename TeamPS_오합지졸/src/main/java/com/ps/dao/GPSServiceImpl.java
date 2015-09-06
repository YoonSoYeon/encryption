package com.ps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ps.mapper.GPSMapper;
import com.ps.mapper.PSMapper;
import com.ps.service.GPSService;
import com.ps.service.PSService;
import com.ps.vo.GPS;
import com.ps.vo.MG;
import com.ps.vo.PS;
//dao class(db?ûë?óÖ?ïò?äî ?Å¥?ûò?ä§) --> select, insert, delete...
//java Mapper(CustomerMapper.java)Î•? ?ù¥?ö©?ï¥?Ñú ?ûë?óÖ
@Component("ps5")
public class GPSServiceImpl implements GPSService {
	
	@Autowired
	GPSMapper mapper;

	@Override
	public void ginsert(GPS c) {
		mapper.ginsert(c);
	}

	@Override
	public List<GPS> all() {
		// TODO Auto-generated method stub
		return mapper.all();
	}

	@Override
	public List<GPS> findBySearch(String gname) {
		// TODO Auto-generated method stub
		return mapper.findBySearch("%"+gname+"%");
	}

	@Override
	public GPS findByNum(String gnum) {
		// TODO Auto-generated method stub
		System.out.println(gnum+"≥ ππæﬂ");
		return mapper.findByNum(gnum);
	}
	
	@Override
	public GPS findBygname(String gnum) {
		// TODO Auto-generated method stub
		return mapper.findBygname(gnum);
	}



	@Override
	public void ginfoinsert(String gnum, String gname) {
		// TODO Auto-generated method stub
		mapper.ginfoinsert(gnum, gname);
	}


	@Override
	public GPS findByName(String name) {
		// TODO Auto-generated method stub
		return mapper.findByName(name);
	}

	@Override
	public void deleteByNum(GPS m) {
		 mapper.deleteByNum(m);
	}



}
	


