package kr.ac.nollrae.host.vo;

import java.io.Serializable;

public class LodgmentGradeVO implements Serializable{
	//LDG_GRADE TABLE
	
	//등급코드
	private String ldgGrdCode;
	//등급
	private int ldgGrdTp;
	
	public String getLdgGrdCode() {
		return ldgGrdCode;
	}
	
	public void setLdgGrdCode(String ldgGrdCode) {
		this.ldgGrdCode = ldgGrdCode;
	}
	
	public int getLdgGrdTp() {
		return ldgGrdTp;
	}
	
	public void setLdgGrdTp(int ldgGrdTp) {
		this.ldgGrdTp = ldgGrdTp;
	}
	
}
