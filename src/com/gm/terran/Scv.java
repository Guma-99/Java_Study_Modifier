package com.gm.terran;

import com.gm.unit.Unit;

public class Scv extends Unit{
	
	public void attack() {
		System.out.println("공격...");
	}
	
	public void work() {
		System.out.println("일하기");
	}
	
	// 오버라이딩
	public void move() {
		System.out.println("꿈틀꿈틀");
	}

}
