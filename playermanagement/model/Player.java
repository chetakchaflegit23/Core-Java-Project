package com.yash.playermanagement.model;

public class Player 
{	
	private int rankNo; 
	private String pname; 
	private int age; 
	private int pscore; 
	private boolean pstatus;
	
	public int getRankNo() {
		return rankNo;
	}
	
	public void setRankNo(int rankNo) {
		this.rankNo = rankNo;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPscore() {
		return pscore;
	}
	public void setPscore(int pscore) {
		this.pscore = pscore;
	}
	public boolean isPstatus() {
		return pstatus;
	}
	public void setPstatus(boolean pstatus) {
		this.pstatus = pstatus;
	}
}
