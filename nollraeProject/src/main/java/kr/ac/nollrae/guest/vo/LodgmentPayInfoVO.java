package kr.ac.nollrae.guest.vo;

import java.io.Serializable;

public class LodgmentPayInfoVO implements Serializable{
	//LDG_PAY_INFO TABLE
	
	//결제코드
	private String ldgPayCode;
	//예약번호
	private int ldgBkNo;
	//게스트 아이디
	private String gstId;
	//객실코드
	private String roomCode;
	//숙박업체 코드
	private String ldgCode;
	//결제일자
	private String ldgPayDate;
	//결제수단
	private int ldgPayment;
	//결제금액
	private int ldgPayPrice;
	
	public String getLdgPayCode() {
		return ldgPayCode;
	}
	
	public void setLdgPayCode(String ldgPayCode) {
		this.ldgPayCode = ldgPayCode;
	}
	
	public int getLdgBkNo() {
		return ldgBkNo;
	}
	
	public void setLdgBkNo(int ldgBkNo) {
		this.ldgBkNo = ldgBkNo;
	}
	
	public String getGstId() {
		return gstId;
	}
	
	public void setGstId(String gstId) {
		this.gstId = gstId;
	}
	
	public String getRoomCode() {
		return roomCode;
	}
	
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	
	public String getLdgCode() {
		return ldgCode;
	}
	
	public void setLdgCode(String ldgCode) {
		this.ldgCode = ldgCode;
	}
	
	public String getLdgPayDate() {
		return ldgPayDate;
	}
	
	public void setLdgPayDate(String ldgPayDate) {
		this.ldgPayDate = ldgPayDate;
	}
	
	public int getLdgPayment() {
		return ldgPayment;
	}
	
	public void setLdgPayment(int ldgPayment) {
		this.ldgPayment = ldgPayment;
	}
	
	public int getLdgPayPrice() {
		return ldgPayPrice;
	}
	
	public void setLdgPayPrice(int ldgPayPrice) {
		this.ldgPayPrice = ldgPayPrice;
	}
	
}
