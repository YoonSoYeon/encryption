package com.ps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ps.mapper.MGMapper;
import com.ps.service.MGService;
import com.ps.vo.GPS;
import com.ps.vo.MG;
//dao class(db?ûë?óÖ?ïò?äî ?Å¥?ûò?ä§) --> select, insert, delete...
//java Mapper(CustomerMapper.java)Î•? ?ù¥?ö©?ï¥?Ñú ?ûë?óÖ
@Component("ps3")
public class MGServiceImpl implements MGService {
	
	@Autowired
	MGMapper mapper;

	@Override
	public List<MG> all() {
		// TODO Auto-generated method stub
		return mapper.all();
	}

	@Override
	public void mginsert(MG p) {
		mapper.mginsert(p);
		
	}
	
	@Override
	public void deleteByName(MG m) {
		// TODO Auto-generated method stub
		 mapper.deleteByName(m);
	}


	@Override
	public List<MG> findByName(String gid) {
		// TODO Auto-generated method stub
		return mapper.findByName(gid);
	}

	@Override
	public MG findByNum(String gnum) {
		// TODO Auto-generated method stub
		return mapper.findByNum(gnum);
	}

	@Override
	public void deleteByNum(MG m) {
		// TODO Auto-generated method stub
		 mapper.deleteByNum(m);
	}
	

}
	


