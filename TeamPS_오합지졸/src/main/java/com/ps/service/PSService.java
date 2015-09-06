package com.ps.service;

import java.util.List;
import java.util.Map;

import com.ps.vo.GPS;
import com.ps.vo.PS;
//for app
public interface PSService {
	
	public List<PS> all();//ëª¨ë“  ? ˆì½”ë“œ
	public PS findByNum(String num);//ë²ˆí˜¸ë¡? ê²??ƒ‰	
	public List<PS> findByName(String name);//nameë¡? ê²??ƒ‰
	public List<PS> findByTitle(String title);//titleë¡? ê²??ƒ‰
	public void insert(PS c);//ê³ ê° ì¶”ê?
	public void delete(String num);
	public void update(PS c);

	
}
