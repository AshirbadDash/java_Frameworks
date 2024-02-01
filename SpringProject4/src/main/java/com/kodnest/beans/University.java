package com.kodnest.beans;

public class University {

	int uid;
	String uname;
	Trainer t;

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(int uid, String uname, Trainer t) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.t = t;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Trainer getT() {
		return t;
	}

	public void setT(Trainer t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "University [uid=" + uid + ", uname=" + uname + ", t=" + t + "]";
	}
}
