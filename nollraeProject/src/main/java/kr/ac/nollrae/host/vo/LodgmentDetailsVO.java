package kr.ac.nollrae.host.vo;

import java.io.Serializable;

public class LodgmentDetailsVO implements Serializable{
	//LDG_DTLS_INFO TABLE
	
	//숙박업체코드
	private String ldgCode;
	//숙소 소개글
	private String ldgIntrd;
	//숙소 이용정보
	private String ldgUseInfo;
	//숙소등급
	private String ldgGrade;
	
	public String getLdgCode() {
		return ldgCode;
	}
	
	public void setLdgCode(String ldgCode) {
		this.ldgCode = ldgCode;
	}
	
	public String getLdgIntrd() {
		return ldgIntrd;
	}
	
	public void setLdgIntrd(String ldgIntrd) {
		this.ldgIntrd = ldgIntrd;
	}
	
	public String getLdgUseInfo() {
		return ldgUseInfo;
	}
	
	public void setLdgUseInfo(String ldgUseInfo) {
		this.ldgUseInfo = ldgUseInfo;
	}
	
	public String getLdgGrade() {
		return ldgGrade;
	}
	
	public void setLdgGrade(String ldgGrade) {
		this.ldgGrade = ldgGrade;
	}
	
}
