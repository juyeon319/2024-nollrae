package kr.ac.nollrae.common.vo;

import java.io.Serializable;

import kr.ac.nollrae.guest.vo.GuestVO;
import kr.ac.nollrae.host.vo.HostVO;

public class UsersVO implements Serializable{
	//USERS TABLE
	
	//users(게스트+호스트) 아이디
	private String usersId;
	//users(게스트+호스트) 비밀번호
	private String usersPass;
	//users(게스트+호스트) 전화번호
	private String usersTel;
	//users(게스트+호스트) 회원구분
	private String usersDiv;
	//users(게스트+호스트) 탈퇴여부
	private String usersDel;

	private GuestVO guest;
	private HostVO host;

	public String getUsersId() {
		return usersId;
	}

	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}

	public String getUsersPass() {
		return usersPass;
	}

	public void setUsersPass(String usersPass) {
		this.usersPass = usersPass;
	}

	public String getUsersTel() {
		return usersTel;
	}

	public void setUsersTel(String usersTel) {
		this.usersTel = usersTel;
	}

	public String getUsersDiv() {
		return usersDiv;
	}

	public void setUsersDiv(String usersDiv) {
		this.usersDiv = usersDiv;
	}

	public String getUsersDel() {
		return usersDel;
	}

	public void setUsersDel(String usersDel) {
		this.usersDel = usersDel;
	}

}
