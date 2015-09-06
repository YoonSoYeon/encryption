package com.ps.service;

import java.util.List;
import java.util.Map;

import com.ps.vo.GPS;
import com.ps.vo.MG;
import com.ps.vo.PS;
//for app
public interface GPSService {
	
	public List<GPS> all();//ëª¨ë“  ? ˆì½”ë“œ
	public List<GPS> findBySearch(String gname);//ë²ˆí˜¸ë¡? ê²??ƒ‰	
	public void ginsert(GPS c);//ê³ ê° ì¶”ê?
	public void ginfoinsert(String gnum, String gname);//ê³ ê° ì¶”ê?
	public GPS findByName(String name);
	public GPS findByNum(String gnum);
	public GPS findBygname(String gnum);
	public void deleteByNum(GPS m);
	
}
