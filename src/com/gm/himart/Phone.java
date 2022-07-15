package com.gm.himart;

import com.gm.himart.Unit;

public class Phone extends Unit {
	private String company;
	
	public Phone() {
		this.company = "Apple";
		this.setBrand("I-phone");
		this.setPrice(1000000);
		this.setPoint(70);
	}
	
	public void info() {
		super.info();
		System.out.println("company: " + this.company);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
