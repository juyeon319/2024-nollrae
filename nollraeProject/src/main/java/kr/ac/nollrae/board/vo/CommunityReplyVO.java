package kr.ac.nollrae.board.vo;

import java.io.Serializable;

public class CommunityReplyVO implements Serializable{
	//COMMUNITY_REPLY TABLE

	//댓글번호
	private int rpNo;
	//게시글 번호
	private int cmntNo;
	//게스트 아이디
	private String gstId;
	//댓글내용
	private String rpContent;
	//작성일자
	private String rpDate;
	//삭제여부
	private String rpDel;
	//신고여부
	private String rpRep;
	
	public int getRpNo() {
		return rpNo;
	}
	
	public void setRpNo(int rpNo) {
		this.rpNo = rpNo;
	}
	
	public int getCmntNo() {
		return cmntNo;
	}
	
	public void setCmntNo(int cmntNo) {
		this.cmntNo = cmntNo;
	}
	
	public String getGstId() {
		return gstId;
	}
	
	public void setGstId(String gstId) {
		this.gstId = gstId;
	}
	
	public String getRpContent() {
		return rpContent;
	}
	
	public void setRpContent(String rpContent) {
		this.rpContent = rpContent;
	}
	
	public String getRpDate() {
		return rpDate;
	}
	
	public void setRpDate(String rpDate) {
		this.rpDate = rpDate;
	}
	
	public String getRpDel() {
		return rpDel;
	}
	
	public void setRpDel(String rpDel) {
		this.rpDel = rpDel;
	}
	
	public String getRpRep() {
		return rpRep;
	}
	
	public void setRpRep(String rpRep) {
		this.rpRep = rpRep;
	}
	
}
