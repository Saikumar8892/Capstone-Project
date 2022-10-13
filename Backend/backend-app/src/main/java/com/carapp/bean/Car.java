package com.carapp.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	private float cprice;
	private float cmodel;
	private String url;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getCprice() {
		return cprice;
	}
	public void setCprice(float cprice) {
		this.cprice = cprice;
	}
	public float getCmodel() {
		return cmodel;
	}
	public void setCmodel(float cmodel) {
		this.cmodel = cmodel;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + ", cprice=" + cprice + ", cmodel=" + cmodel + ", url=" + url
				+ "]";
	}
	

}