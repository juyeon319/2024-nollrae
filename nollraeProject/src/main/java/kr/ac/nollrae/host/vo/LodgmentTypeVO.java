package kr.ac.nollrae.host.vo;

import java.io.Serializable;

public class LodgmentTypeVO implements Serializable{
	//LDG_TYPE TABLE

	//숙소유형코드
	private String ldgTpCode;
	//분류명
	private String ldgTpNm;
	
	public String getLdgTpCode() {
		return ldgTpCode;
	}
	
	public void setLdgTpCode(String ldgTpCode) {
		this.ldgTpCode = ldgTpCode;
	}
	
	public String getLdgTpNm() {
		return ldgTpNm;
	}
	
	public void setLdgTpNm(String ldgTpNm) {
		this.ldgTpNm = ldgTpNm;
	}
	
}
