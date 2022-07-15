package com.gm.himart;

import com.gm.himart.Unit;

public class Computer extends Unit{
	private String cpu;
	
	public Computer() {
		this.cpu = "intel i5";
		this.setBrand("LG");
		this.setPrice(1500000);
		this.setPoint(100);
	}
	
	public void info() {
		super.info();
		System.out.println("intel i5");
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
}
