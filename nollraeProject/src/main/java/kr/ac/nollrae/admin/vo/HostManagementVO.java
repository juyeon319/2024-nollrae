package kr.ac.nollrae.admin.vo;

import java.io.Serializable;

public class HostManagementVO implements Serializable{
	//HOST_ST_MGMT TABLE
	
	//관리번호
	private int hostMgmtCode;
	//호스트 아이디
	private String hostId;
	//승인일자
	private String hostMgmtDate;
	
	public int getHostMgmtCode() {
		return hostMgmtCode;
	}
	
	public void setHostMgmtCode(int hostMgmtCode) {
		this.hostMgmtCode = hostMgmtCode;
	}
	
	public String getHostId() {
		return hostId;
	}
	
	public void setHostId(String hostId) {
		this.hostId = hostId;
	}
	
	public String getHostMgmtDate() {
		return hostMgmtDate;
	}
	
	public void setHostMgmtDate(String hostMgmtDate) {
		this.hostMgmtDate = hostMgmtDate;
	}
	
}
