package com.demo.model;

import java.time.LocalDate;
import java.util.*;

public class Vehicle {
	private int vid;
	private String vname;
	private double price;
	private String model;
	private LocalDate mgdt; 
	
	public Vehicle() {
		super();
	}

	public Vehicle(int vid, String vname, double price, String model, LocalDate mgdt) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.price = price;
		this.model = model;
		this.mgdt = mgdt;
	}

	

	public Vehicle( int vid) {
		super();
		this.vid = vid;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LocalDate getMgdt() {
		return mgdt;
	}

	public void setMgdt(LocalDate mgdt) {
		this.mgdt = mgdt;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + ", price=" + price + ", model=" + model + ", mgdt=" + mgdt
				+ ", toString()=" + super.toString() + "]";
	}

	

	

	

}
