package kr.ac.nollrae.board.vo;

import java.io.Serializable;

public class NoticeVO implements Serializable{
	//NOTICE_BOARD TABLE
	
	//게시글 번호
	private String ntcNo;
	//게시글 제목
	private String ntcTitle;
	//게시글 내용
	private String ntcContent;
	//작성일자
	private String ntcDate;
	//조회수
	private int ntcCnt;
	//공지여부
	private String ntcAt;
	//삭제여부
	private String ntcDel;
	
	public String getNtcNo() {
		return ntcNo;
	}
	
	public void setNtcNo(String ntcNo) {
		this.ntcNo = ntcNo;
	}
	
	public String getNtcTitle() {
		return ntcTitle;
	}
	
	public void setNtcTitle(String ntcTitle) {
		this.ntcTitle = ntcTitle;
	}
	
	public String getNtcContent() {
		return ntcContent;
	}
	
	public void setNtcContent(String ntcContent) {
		this.ntcContent = ntcContent;
	}
	
	public String getNtcDate() {
		return ntcDate;
	}
	
	public void setNtcDate(String ntcDate) {
		this.ntcDate = ntcDate;
	}
	
	public int getNtcCnt() {
		return ntcCnt;
	}
	
	public void setNtcCnt(int ntcCnt) {
		this.ntcCnt = ntcCnt;
	}
	
	public String getNtcAt() {
		return ntcAt;
	}
	
	public void setNtcAt(String ntcAt) {
		this.ntcAt = ntcAt;
	}
	
	public String getNtcDel() {
		return ntcDel;
	}
	
	public void setNtcDel(String ntcDel) {
		this.ntcDel = ntcDel;
	}
	
}
