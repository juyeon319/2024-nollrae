package kr.ac.nollrae.guest.vo;

public class CouponListVO {
	//GUEST_COUPON_LIST TABLE
	
	//쿠폰번호
	private int cpnNo;
	//게스트아이디
	private String gstId;
	//쿠폰 발급일자
	private String gclIssueDate;
	//쿠폰 사용여부
	private String gclUse;
	
	public int getCpnNo() {
		return cpnNo;
	}
	
	public void setCpnNo(int cpnNo) {
		this.cpnNo = cpnNo;
	}
	
	public String getGstId() {
		return gstId;
	}
	
	public void setGstId(String gstId) {
		this.gstId = gstId;
	}
	
	public String getGclIssueDate() {
		return gclIssueDate;
	}
	
	public void setGclIssueDate(String gclIssueDate) {
		this.gclIssueDate = gclIssueDate;
	}
	
	public String getGclUse() {
		return gclUse;
	}
	
	public void setGclUse(String gclUse) {
		this.gclUse = gclUse;
	}
	
}
