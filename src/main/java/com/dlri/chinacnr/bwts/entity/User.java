package com.dlri.chinacnr.bwts.entity;

/**
 * 
 * @author chenchuang
 *
 */

public class User {
	
	private Long id;//编号
	private String fullname;
	private String gender;
	private String userno;
	private String pwd;
	private String birthday;
	private String phone;
	private String addr;
	private String fnamepy;
	private String worktime;
	private String nation;
	private String idcard;
	private int hometown;
	private int diploma;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserno() {
		return userno;
	}
	public void setUserno(String userno) {
		this.userno = userno;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getFnamepy() {
		return fnamepy;
	}
	public void setFnamepy(String fnamepy) {
		this.fnamepy = fnamepy;
	}
	public String getWorktime() {
		return worktime;
	}
	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public int getHometown() {
		return hometown;
	}
	public void setHometown(int hometown) {
		this.hometown = hometown;
	}
	public int getDiploma() {
		return diploma;
	}
	public void setDiploma(int diploma) {
		this.diploma = diploma;
	}
}
