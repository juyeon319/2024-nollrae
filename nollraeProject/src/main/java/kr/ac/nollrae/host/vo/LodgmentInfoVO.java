package kr.ac.nollrae.host.vo;

import java.io.Serializable;

public class LodgmentInfoVO implements Serializable{
	//LDG_INFO TABLE
	
	//숙박업체코드
	private String ldgCode;
	//호스트 아이디
	private String hostId;
	//숙박업체명
	private String ldgTitle;
	//숙소유형
	private String ldgType;
	//대표자명
	private String ldgHostNm;
	//전화번호
	private int ldgTel;
	//이메일
	private String ldgMail;
	//우편주소
	private int ldgZip;
	//주소
	private String lodAddr1;
	//상세주소
	private String lodAddr2;
	//운영여부
	private String lodSt;
	
	public String getLdgCode() {
		return ldgCode;
	}
	
	public void setLdgCode(String ldgCode) {
		this.ldgCode = ldgCode;
	}
	
	public String getHostId() {
		return hostId;
	}
	
	public void setHostId(String hostId) {
		this.hostId = hostId;
	}
	
	public String getLdgTitle() {
		return ldgTitle;
	}
	
	public void setLdgTitle(String ldgTitle) {
		this.ldgTitle = ldgTitle;
	}
	
	public String getLdgType() {
		return ldgType;
	}
	
	public void setLdgType(String ldgType) {
		this.ldgType = ldgType;
	}
	
	public String getLdgHostNm() {
		return ldgHostNm;
	}
	
	public void setLdgHostNm(String ldgHostNm) {
		this.ldgHostNm = ldgHostNm;
	}
	
	public int getLdgTel() {
		return ldgTel;
	}
	
	public void setLdgTel(int ldgTel) {
		this.ldgTel = ldgTel;
	}
	
	public String getLdgMail() {
		return ldgMail;
	}
	
	public void setLdgMail(String ldgMail) {
		this.ldgMail = ldgMail;
	}
	
	public int getLdgZip() {
		return ldgZip;
	}
	
	public void setLdgZip(int ldgZip) {
		this.ldgZip = ldgZip;
	}
	
	public String getLodAddr1() {
		return lodAddr1;
	}
	
	public void setLodAddr1(String lodAddr1) {
		this.lodAddr1 = lodAddr1;
	}
	
	public String getLodAddr2() {
		return lodAddr2;
	}
	
	public void setLodAddr2(String lodAddr2) {
		this.lodAddr2 = lodAddr2;
	}
	
	public String getLodSt() {
		return lodSt;
	}
	
	public void setLodSt(String lodSt) {
		this.lodSt = lodSt;
	}

}
