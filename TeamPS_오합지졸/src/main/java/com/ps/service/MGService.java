package com.ps.service;

import java.util.List;

import com.ps.vo.GPS;
import com.ps.vo.MG;
//for app
public interface MGService {
	
	public List<MG> all();//모든 ?��코드
	public void mginsert(MG p);
	public void deleteByName(MG m);
	public void deleteByNum(MG m);
	public List<MG> findByName(String gid);
	public MG findByNum(String gnum);
}
