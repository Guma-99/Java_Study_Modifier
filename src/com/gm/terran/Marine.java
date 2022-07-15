package com.gm.terran;

import com.gm.unit.Unit;

public class Marine extends Unit {
	
	private String weapon;	
	
	public Marine() {
		super(30);
	}
	
	public void shoot() {
		System.out.println("땅땅땅빵");
	}
	
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	// 오버라이딩
	public void move() {
		System.out.println("뛰어 다님");
	}
	
	// Unit에 있어도 오버라이딩
	public void info() {
		System.out.println("Marine info");
	}
}
