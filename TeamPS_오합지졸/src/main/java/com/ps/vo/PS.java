package com.ps.vo;
//board ?…Œ?´ë¸”ì„ ?œ„?•œ vo

public class PS {

	private String id, pass, name, tel, email, address;
	//1.data -7ê°?
	//2.getter/setter
	//3.?ƒ?„±? : (), 7 ê°œì§œë¦?
	public PS() {
		
	}
	
	public PS(String id, String pass, String name, String tel, String email, String address) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.address = address;
	}

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
