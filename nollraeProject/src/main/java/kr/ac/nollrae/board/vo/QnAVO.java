package kr.ac.nollrae.board.vo;

import java.io.Serializable;

public class QnAVO implements Serializable{
	//QNA_BOARD TABLE
	
	//게시글 번호
	private int qnaNo;
	//게스트 아이디
	private String gstId;
	//게시글 제목
	private String qnaTitle;
	//게시글 내용
	private String qnaContent;
	//작성일자
	private String qnaDate;
	//삭제여부
	private String qnaDel;
	//답변여부
	private String qnaReplyAt;
	
	public int getQnaNo() {
		return qnaNo;
	}
	
	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}
	
	public String getGstId() {
		return gstId;
	}
	
	public void setGstId(String gstId) {
		this.gstId = gstId;
	}
	
	public String getQnaTitle() {
		return qnaTitle;
	}
	
	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}
	
	public String getQnaContent() {
		return qnaContent;
	}
	
	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}
	
	public String getQnaDate() {
		return qnaDate;
	}
	
	public void setQnaDate(String qnaDate) {
		this.qnaDate = qnaDate;
	}
	
	public String getQnaDel() {
		return qnaDel;
	}
	
	public void setQnaDel(String qnaDel) {
		this.qnaDel = qnaDel;
	}
	
	public String getQnaReplyAt() {
		return qnaReplyAt;
	}
	
	public void setQnaReplyAt(String qnaReplyAt) {
		this.qnaReplyAt = qnaReplyAt;
	}
	
}
