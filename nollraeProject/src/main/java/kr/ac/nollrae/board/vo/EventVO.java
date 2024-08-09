package kr.ac.nollrae.board.vo;

import java.io.Serializable;

public class EventVO implements Serializable{
	//EVENT_BOARD TABLE
	
	//게시글 번호
	private int evtNo;
	//게시글 제목
	private String evtTitle;
	//게시글 내용
	private String evtContent;
	//작성일자
	private String evtDate;
	//조회수
	private int evtCnt;
	//시작일자
	private String evtStrtDt;
	//종료일자
	private String evtEndDt;
	//삭제여부
	private String evtDel;
	
	public int getEvtNo() {
		return evtNo;
	}
	
	public void setEvtNo(int evtNo) {
		this.evtNo = evtNo;
	}
	
	public String getEvtTitle() {
		return evtTitle;
	}
	
	public void setEvtTitle(String evtTitle) {
		this.evtTitle = evtTitle;
	}
	
	public String getEvtContent() {
		return evtContent;
	}
	
	public void setEvtContent(String evtContent) {
		this.evtContent = evtContent;
	}
	
	public String getEvtDate() {
		return evtDate;
	}
	
	public void setEvtDate(String evtDate) {
		this.evtDate = evtDate;
	}
	
	public int getEvtCnt() {
		return evtCnt;
	}
	
	public void setEvtCnt(int evtCnt) {
		this.evtCnt = evtCnt;
	}
	
	public String getEvtStrtDt() {
		return evtStrtDt;
	}
	
	public void setEvtStrtDt(String evtStrtDt) {
		this.evtStrtDt = evtStrtDt;
	}
	
	public String getEvtEndDt() {
		return evtEndDt;
	}
	
	public void setEvtEndDt(String evtEndDt) {
		this.evtEndDt = evtEndDt;
	}
	
	public String getEvtDel() {
		return evtDel;
	}
	
	public void setEvtDel(String evtDel) {
		this.evtDel = evtDel;
	}
	
}
