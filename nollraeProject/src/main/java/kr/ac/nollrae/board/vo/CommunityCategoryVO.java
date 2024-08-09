package kr.ac.nollrae.board.vo;

import java.io.Serializable;

public class CommunityCategoryVO implements Serializable{
	//CMNT_CATEGORY TABLE

	//카테고리 코드
	private String cmntCtgrCode;
	//카테고리명
	private String cmntCtgrNm;
	
	public String getCmntCtgrCode() {
		return cmntCtgrCode;
	}
	
	public void setCmntCtgrCode(String cmntCtgrCode) {
		this.cmntCtgrCode = cmntCtgrCode;
	}
	
	public String getCmntCtgrNm() {
		return cmntCtgrNm;
	}
	
	public void setCmntCtgrNm(String cmntCtgrNm) {
		this.cmntCtgrNm = cmntCtgrNm;
	}
	
}
