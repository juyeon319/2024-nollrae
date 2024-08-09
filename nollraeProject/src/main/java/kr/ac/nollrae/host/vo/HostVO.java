package kr.ac.nollrae.host.vo;

import java.io.Serializable;

public class HostVO implements Serializable{
	//HOST TABLE

	//호스트 아이디
	private String hostId;
	//사업자등록번호
	private int hostBsnsLicNo;
	//사업자등록증명원
	private String hostBsnsLicImg;
	//호스트 이름
	private String hostNm;
	//영업 승인여부
	private String hostSt;
	
	public String getHostId() {
		return hostId;
	}
	
	public void setHostId(String hostId) {
		this.hostId = hostId;
	}
	
	public int getHostBsnsLicNo() {
		return hostBsnsLicNo;
	}
	
	public void setHostBsnsLicNo(int hostBsnsLicNo) {
		this.hostBsnsLicNo = hostBsnsLicNo;
	}
	
	public String getHostBsnsLicImg() {
		return hostBsnsLicImg;
	}
	
	public void setHostBsnsLicImg(String hostBsnsLicImg) {
		this.hostBsnsLicImg = hostBsnsLicImg;
	}
	
	public String getHostNm() {
		return hostNm;
	}
	
	public void setHostNm(String hostNm) {
		this.hostNm = hostNm;
	}
	
	public String getHostSt() {
		return hostSt;
	}
	
	public void setHostSt(String hostSt) {
		this.hostSt = hostSt;
	}
	
}
