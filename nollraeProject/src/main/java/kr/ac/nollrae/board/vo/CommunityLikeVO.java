package kr.ac.nollrae.board.vo;

import java.io.Serializable;

public class CommunityLikeVO implements Serializable{
	//COMMUNITY_LIKE TABLE

	//게시글 번호
	private int cmntNo;
	//게스트 아이디
	private String gstId;
	
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
	
}
