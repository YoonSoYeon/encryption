package com.ps.service;

import java.util.List;

import com.ps.vo.GIPS;
//for app
public interface GIPSService {
	
	public List<GIPS> all();//모든 ?��코드
	public GIPS findByNum(String ginum);
	public void ginfoinsert(GIPS p);
}
