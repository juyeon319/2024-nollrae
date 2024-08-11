package kr.ac.nollrae.board.vo;

import java.io.Serializable;

public class QnAReplyVO implements Serializable{
	//QNA_REPLY TABLE
	
	//답변번호
	private int qrepNo;
	//게시글 번호
	private String qnaNo;
	//답변일자
	private String qrepDt;
	//답변내용
	private String qrepContent;
	
	public int getQrepNo() {
		return qrepNo;
	}
	
	public void setQrepNo(int qrepNo) {
		this.qrepNo = qrepNo;
	}
	
	public String getQnaNo() {
		return qnaNo;
	}
	
	public void setQnaNo(String qnaNo) {
		this.qnaNo = qnaNo;
	}
	
	public String getQrepDt() {
		return qrepDt;
	}
	
	public void setQrepDt(String qrepDt) {
		this.qrepDt = qrepDt;
	}
	
	public String getQrepContent() {
		return qrepContent;
	}
	
	public void setQrepContent(String qrepContent) {
		this.qrepContent = qrepContent;
	}
	
}
