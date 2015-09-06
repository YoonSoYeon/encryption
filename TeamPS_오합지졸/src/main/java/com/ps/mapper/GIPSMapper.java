package com.ps.mapper;


import java.util.List;

import com.ps.vo.GIPS;

//for impl
public interface GIPSMapper {
	public List<GIPS> all();//ëª¨ë“  ? ˆì½”ë“œ
	public void ginsert(GIPS c);//ê³ ê° ì¶”ê?
	public void ginfoinsert(GIPS c);//ê³ ê° ì¶”ê?
	public List<GIPS> findBySearch(String giname);
	public GIPS findByNum(String ginum);
/*	public PS findByNum(String num);//ë²ˆí˜¸ë¡? ê²??ƒ‰
	public List<PS> findByName(String name);//titleë¡? ê²??ƒ‰
	public List<PS> findBySpdate(String spdate);//nameë¡? ê²??ƒ‰
	public List<PS> findByEpdate(String epdate);//nameë¡? ê²??ƒ‰
	public List<PS> findByGid(String gid);//nameë¡? ê²??ƒ‰
	public void delete(String num);
	public void update(PS c);*/
	
}
	