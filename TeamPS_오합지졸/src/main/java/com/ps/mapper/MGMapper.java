package com.ps.mapper;


import java.util.List;

import com.ps.vo.GPS;
import com.ps.vo.MG;

//for impl
public interface MGMapper {
	public List<MG> all();//ëª¨ë“  ? ˆì½”ë“œ
	public void mginsert(MG c);//ê³ ê° ì¶”ê?
	public void deleteByName(MG m);
	public void deleteByNum(MG m);
	public List<MG> findByName(String gid);
	public MG findByNum(String gmnum);
	
/*	public PS findByNum(String num);//ë²ˆí˜¸ë¡? ê²??ƒ‰
	public List<PS> findByName(String name);//titleë¡? ê²??ƒ‰
	public List<PS> findBySpdate(String spdate);//nameë¡? ê²??ƒ‰
	public List<PS> findByEpdate(String epdate);//nameë¡? ê²??ƒ‰
	public List<PS> findByGid(String gid);//nameë¡? ê²??ƒ‰
	public void delete(String num);
	public void update(PS c);*/
	
}
	