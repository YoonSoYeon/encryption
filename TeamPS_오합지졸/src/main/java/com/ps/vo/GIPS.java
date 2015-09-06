package com.ps.vo;
//board ?…Œ?´ë¸”ì„ ?œ„?•œ vo

public class GIPS {

	private String ginum, giname, gidnum;
	//1.data -7ê°?
	//2.getter/setter
	//3.?ƒ?„±? : (), 7 ê°œì§œë¦?

	public GIPS() {
		
	}

	public GIPS(String ginum, String giname, String gidnum) {
		super();
		this.ginum = ginum;
		this.giname = giname;
		this.gidnum = gidnum;
	}

	public String getGinum() {
		return ginum;
	}

	public void setGinum(String ginum) {
		this.ginum = ginum;
	}

	public String getGiname() {
		return giname;
	}

	public void setGiname(String giname) {
		this.giname = giname;
	}

	public String getGidnum() {
		return gidnum;
	}

	public void setGidnum(String gidnum) {
		this.gidnum = gidnum;
	}

	
	
}
