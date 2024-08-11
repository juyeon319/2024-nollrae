package kr.ac.nollrae.guest.vo;

import java.io.Serializable;

public class CouponVO implements Serializable{
	//COUPON TABLE
	
	//쿠폰번호
	private String cpnNo;
	//쿠폰명
	private String cpnNm;
	//할인률
	private int cpnDiscp;
	//시작일자
	private String cpnStrtDt;
	//종료일자
	private String cpnEndDt;
	//쿠폰상태
	private String cpnSt;
	//쿠폰카테고리
	private String cpnCtgr;
	
	private CouponListVO couponList;

	public String getCpnNo() {
		return cpnNo;
	}

	public void setCpnNo(String cpnNo) {
		this.cpnNo = cpnNo;
	}

	public String getCpnNm() {
		return cpnNm;
	}

	public void setCpnNm(String cpnNm) {
		this.cpnNm = cpnNm;
	}

	public int getCpnDiscp() {
		return cpnDiscp;
	}

	public void setCpnDiscp(int cpnDiscp) {
		this.cpnDiscp = cpnDiscp;
	}

	public String getCpnStrtDt() {
		return cpnStrtDt;
	}

	public void setCpnStrtDt(String cpnStrtDt) {
		this.cpnStrtDt = cpnStrtDt;
	}

	public String getCpnEndDt() {
		return cpnEndDt;
	}

	public void setCpnEndDt(String cpnEndDt) {
		this.cpnEndDt = cpnEndDt;
	}

	public String getCpnSt() {
		return cpnSt;
	}

	public void setCpnSt(String cpnSt) {
		this.cpnSt = cpnSt;
	}

	public String getCpnCtgr() {
		return cpnCtgr;
	}

	public void setCpnCtgr(String cpnCtgr) {
		this.cpnCtgr = cpnCtgr;
	}

	public CouponListVO getCouponList() {
		return couponList;
	}

	public void setCouponList(CouponListVO couponList) {
		this.couponList = couponList;
	}

}