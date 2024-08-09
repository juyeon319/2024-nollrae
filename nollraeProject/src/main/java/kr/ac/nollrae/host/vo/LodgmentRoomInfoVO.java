package kr.ac.nollrae.host.vo;

import java.io.Serializable;

public class LodgmentRoomInfoVO implements Serializable{
	//LDG_ROOM_INFO TABLE
	
	//객실코드
	private String roomCode;
	//숙박업체코드
	private String ldgCode;
	//객실명
	private String roomNm;
	//객실유형
	private String roomTp;
	//최대 수용 인원 수
	private int roomPrsnCnt;
	//객실갯수
	private int roomCnt;
	//객실가격
	private int roomPrice;
	//체크인시간
	private String roomCheckin;
	//체크아웃시간
	private String roomCheckout;
	//객실소개
	private String roomContent;
	//사용여부
	private String roomSt;
	
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
	
	public String getRoomNm() {
		return roomNm;
	}
	
	public void setRoomNm(String roomNm) {
		this.roomNm = roomNm;
	}
	
	public String getRoomTp() {
		return roomTp;
	}
	
	public void setRoomTp(String roomTp) {
		this.roomTp = roomTp;
	}
	
	public int getRoomPrsnCnt() {
		return roomPrsnCnt;
	}
	
	public void setRoomPrsnCnt(int roomPrsnCnt) {
		this.roomPrsnCnt = roomPrsnCnt;
	}
	
	public int getRoomCnt() {
		return roomCnt;
	}
	
	public void setRoomCnt(int roomCnt) {
		this.roomCnt = roomCnt;
	}
	
	public int getRoomPrice() {
		return roomPrice;
	}
	
	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	
	public String getRoomCheckin() {
		return roomCheckin;
	}
	
	public void setRoomCheckin(String roomCheckin) {
		this.roomCheckin = roomCheckin;
	}
	
	public String getRoomCheckout() {
		return roomCheckout;
	}
	
	public void setRoomCheckout(String roomCheckout) {
		this.roomCheckout = roomCheckout;
	}
	
	public String getRoomContent() {
		return roomContent;
	}
	
	public void setRoomContent(String roomContent) {
		this.roomContent = roomContent;
	}
	
	public String getRoomSt() {
		return roomSt;
	}
	
	public void setRoomSt(String roomSt) {
		this.roomSt = roomSt;
	}

}
