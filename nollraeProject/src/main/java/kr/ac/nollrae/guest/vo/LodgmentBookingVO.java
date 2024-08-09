package kr.ac.nollrae.guest.vo;

import java.io.Serializable;

public class LodgmentBookingVO implements Serializable{
	//LDG_BOOKING TABLE
	
	//예약번호
	private int ldgBkSt;
	//게스트 아이디
	private String gstId;
	//객실코드
	private String roomCode;
	//숙박업체코드
	private String ldgCode;
	//예약상태
	private int ldgBkNo;
	
	public int getLdgBkSt() {
		return ldgBkSt;
	}
	
	public void setLdgBkSt(int ldgBkSt) {
		this.ldgBkSt = ldgBkSt;
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
	
	public int getLdgBkNo() {
		return ldgBkNo;
	}
	
	public void setLdgBkNo(int ldgBkNo) {
		this.ldgBkNo = ldgBkNo;
	}
	
}
