package kr.ac.nollrae.host.vo;

import java.io.Serializable;

public class LodgmentServiceInfoVO implements Serializable{
	//LDG_SRVC_INFO TABLE
	
	//숙박업체 코드명
	private String ldgCode;
	//서비스옵션코드
	private String ldgSrvcCode;
	
	public String getLdgCode() {
		return ldgCode;
	}
	
	public void setLdgCode(String ldgCode) {
		this.ldgCode = ldgCode;
	}
	
	public String getLdgSrvcCode() {
		return ldgSrvcCode;
	}
	
	public void setLdgSrvcCode(String ldgSrvcCode) {
		this.ldgSrvcCode = ldgSrvcCode;
	}
	
}
