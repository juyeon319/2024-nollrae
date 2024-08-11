package kr.ac.nollrae.board.vo;

import java.io.Serializable;

public class CommunityVO implements Serializable{
	//COMMUNITY_BOARD TABLE
	
	//게시글 번호
	private String cmntNo;
	//게스트 아이디
	private String gstId;
	//지역코드
	private String cmntRgnCode;
	//카테고리 코드
	private String cmntCtgrCode;
	//게시글 제목
	private String cmntTitle;
	//게시글 내용
	private String cmntContent;
	//작성일자
	private String cmntDate;
	//조회수
	private int cmntCnt;
	//삭제여부
	private String cmntDel;
	//신고여부
	private String cmntRep;
	
	public String getCmntNo() {
		return cmntNo;
	}
	
	public void setCmntNo(String cmntNo) {
		this.cmntNo = cmntNo;
	}
	
	public String getGstId() {
		return gstId;
	}
	
	public void setGstId(String gstId) {
		this.gstId = gstId;
	}
	
	public String getCmntRgnCode() {
		return cmntRgnCode;
	}
	
	public void setCmntRgnCode(String cmntRgnCode) {
		this.cmntRgnCode = cmntRgnCode;
	}
	
	public String getCmntCtgrCode() {
		return cmntCtgrCode;
	}
	
	public void setCmntCtgrCode(String cmntCtgrCode) {
		this.cmntCtgrCode = cmntCtgrCode;
	}
	
	public String getCmntTitle() {
		return cmntTitle;
	}
	
	public void setCmntTitle(String cmntTitle) {
		this.cmntTitle = cmntTitle;
	}
	
	public String getCmntContent() {
		return cmntContent;
	}
	
	public void setCmntContent(String cmntContent) {
		this.cmntContent = cmntContent;
	}
	
	public String getCmntDate() {
		return cmntDate;
	}
	
	public void setCmntDate(String cmntDate) {
		this.cmntDate = cmntDate;
	}
	
	public int getCmntCnt() {
		return cmntCnt;
	}
	
	public void setCmntCnt(int cmntCnt) {
		this.cmntCnt = cmntCnt;
	}
	
	public String getCmntDel() {
		return cmntDel;
	}
	
	public void setCmntDel(String cmntDel) {
		this.cmntDel = cmntDel;
	}
	
	public String getCmntRep() {
		return cmntRep;
	}
	
	public void setCmntRep(String cmntRep) {
		this.cmntRep = cmntRep;
	}

}
