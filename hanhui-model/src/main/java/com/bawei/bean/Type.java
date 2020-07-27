package com.bawei.bean;

public class Type {

	private Integer tid;
	private String tname;
	private Integer mcount;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getMcount() {
		return mcount;
	}
	public void setMcount(Integer mcount) {
		this.mcount = mcount;
	}
	public Type(Integer tid, String tname, Integer mcount) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.mcount = mcount;
	}
	public Type() {
		super();
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", tname=" + tname + ", mcount=" + mcount + "]";
	}
	
	
}
