package com.ps.mapper;


import java.util.List;

import com.ps.vo.GPS;
import com.ps.vo.MG;
import com.ps.vo.PS;

//for impl
public interface GPSMapper {
	public List<GPS> all();//모든 ?��코드
	public void ginsert(GPS c);//고객 추�?
	public void ginfoinsert(String gnum, String gname);//고객 추�?
	public List<GPS> findBySearch(String gname);
	public GPS findByNum(String gnum);
	public GPS findByName(String giname);
	public GPS findBygname(String gnum);
	public void deleteByNum(GPS m);

	
}
	