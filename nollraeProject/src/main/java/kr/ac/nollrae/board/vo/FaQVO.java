package kr.ac.nollrae.board.vo;

import java.io.Serializable;

public class FaQVO implements Serializable{
	//FAQ_BOARD TABLE
	
	//자주묻는질문 글번호
	private String faqNo;
	//자주묻는질문 카테고리
	private String faqCtgr;
	//자주묻는질문 글제목
	private String faqTitle;
	//자주묻는질문 글내용
	private String faqContent;
	//자주묻는질문 삭제여부
	private String faqDel;
	
	public String getFaqNo() {
		return faqNo;
	}
	
	public void setFaqNo(String faqNo) {
		this.faqNo = faqNo;
	}
	
	public String getFaqCtgr() {
		return faqCtgr;
	}
	
	public void setFaqCtgr(String faqCtgr) {
		this.faqCtgr = faqCtgr;
	}
	
	public String getFaqTitle() {
		return faqTitle;
	}
	
	public void setFaqTitle(String faqTitle) {
		this.faqTitle = faqTitle;
	}
	
	public String getFaqContent() {
		return faqContent;
	}
	
	public void setFaqContent(String faqContent) {
		this.faqContent = faqContent;
	}
	
	public String getFaqDel() {
		return faqDel;
	}
	
	public void setFaqDel(String faqDel) {
		this.faqDel = faqDel;
	}
	
	
}
