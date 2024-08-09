package kr.ac.nollrae.host.vo;

import java.io.Serializable;

public class LodgmentLikeVO implements Serializable{
	//LDG_LIKE TABLE
	
	//게스트 아이디
	private String gstId;
	//숙박업체코드
	private String ldgCode;
	//찜한일자
	private String ldgLikeDate;
	
	public String getGstId() {
		return gstId;
	}
	
	public void setGstId(String gstId) {
		this.gstId = gstId;
	}
	
	public String getLdgCode() {
		return ldgCode;
	}
	
	public void setLdgCode(String ldgCode) {
		this.ldgCode = ldgCode;
	}
	
	public String getLdgLikeDate() {
		return ldgLikeDate;
	}
	
	public void setLdgLikeDate(String ldgLikeDate) {
		this.ldgLikeDate = ldgLikeDate;
	}
	
}
