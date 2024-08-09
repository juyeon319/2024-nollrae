package kr.ac.nollrae.guest.vo;

import java.io.Serializable;

public class GuestVO implements Serializable{
	//GUSET TABLE

	//게스트 아이디
	private String gstId;
	//게스트 이름
	private String gstNm;
	//게스트 생년월일
	private String gstBir;
	//게스트 성별
	private String gstGen;
	//게스트 프로필사진
	private String gstImg;
	
	public String getGstId() {
		return gstId;
	}
	
	public void setGstId(String gstId) {
		this.gstId = gstId;
	}
	
	public String getGstNm() {
		return gstNm;
	}
	
	public void setGstNm(String gstNm) {
		this.gstNm = gstNm;
	}
	
	public String getGstBir() {
		return gstBir;
	}
	
	public void setGstBir(String gstBir) {
		this.gstBir = gstBir;
	}
	
	public String getGstGen() {
		return gstGen;
	}
	
	public void setGstGen(String gstGen) {
		this.gstGen = gstGen;
	}
	
	public String getGstImg() {
		return gstImg;
	}
	
	public void setGstImg(String gstImg) {
		this.gstImg = gstImg;
	}
	
}
