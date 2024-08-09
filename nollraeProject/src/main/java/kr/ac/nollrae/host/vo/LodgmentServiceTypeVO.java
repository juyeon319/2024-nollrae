package kr.ac.nollrae.host.vo;

import java.io.Serializable;

public class LodgmentServiceTypeVO implements Serializable{
	//LDG_SRVC_TYPE TABLE
	
	//옵션코드
	private String ldgSrvcCode;
	//옵션명
	private String ldgSrvcNm;
	
	public String getLdgSrvcCode() {
		return ldgSrvcCode;
	}
	
	public void setLdgSrvcCode(String ldgSrvcCode) {
		this.ldgSrvcCode = ldgSrvcCode;
	}
	
	public String getLdgSrvcNm() {
		return ldgSrvcNm;
	}
	
	public void setLdgSrvcNm(String ldgSrvcNm) {
		this.ldgSrvcNm = ldgSrvcNm;
	}
	
}
