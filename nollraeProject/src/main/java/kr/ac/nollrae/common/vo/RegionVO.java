package kr.ac.nollrae.common.vo;

import java.io.Serializable;

public class RegionVO implements Serializable{
	//Region TABLE

	//지역코드
	private String rgnCode;
	//지역명
	private String rgnNm;
	
	public String getRgnCode() {
		return rgnCode;
	}
	
	public void setRgnCode(String rgnCode) {
		this.rgnCode = rgnCode;
	}
	
	public String getRgnNm() {
		return rgnNm;
	}
	
	public void setRgnNm(String rgnNm) {
		this.rgnNm = rgnNm;
	}
	
}
