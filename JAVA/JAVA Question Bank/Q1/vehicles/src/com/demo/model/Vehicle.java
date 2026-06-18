package com.demo.model;

import java.util.Objects;

public class Vehicle {
	private int vid;
	private String vname, status;
	private double price;
	
	
	
	public Vehicle() {
		super();
	}


	public Vehicle(int vid, String vname, double price, String status) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.price = price;
		this.status = status;
	}


	public int getVid() {
		return vid;
	}


	public void setVid(int vid) {
		this.vid = vid;
	}


	public String getVname() {
		return vname;
	}


	public void setVname(String vname) {
		this.vname = vname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + ", price=" + price + ", status=" + status + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash( vid);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null) 
			return false;
		if (!(obj instanceof Vehicle))
			return false;
		Vehicle other = (Vehicle) obj;
		return vid == other.vid;
	}
	
	
	
	
	
	
}
