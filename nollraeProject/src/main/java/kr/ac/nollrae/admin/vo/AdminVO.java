package kr.ac.nollrae.admin.vo;

import java.io.Serializable;

public class AdminVO implements Serializable{
	//ADMIN TABLE
	
	//관리자 아이디
	private String adminId;
	//관리자 비밀번호
	private String adminPass;
	
	public String getAdminId() {
		return adminId;
	}
	
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	
	public String getAdminPass() {
		return adminPass;
	}
	
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	
}
