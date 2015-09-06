package com.ps.mapper;

import java.util.List;

import com.ps.vo.PS;

//for impl
public interface PSMapper {
	public List<PS> all();//ëª¨ë“  ? ˆì½”ë“œ
	public void insert(PS c);//ê³ ê° ì¶”ê?
	public PS findByNum(String num);//ë²ˆí˜¸ë¡? ê²??ƒ‰
	public List<PS> findByTitle(String title);//titleë¡? ê²??ƒ‰
	public List<PS> findByName(String name);//nameë¡? ê²??ƒ‰
	public void delete(String num);
	public void update(PS b);
	public List<PS> ByLogin(String id);
	
}
	