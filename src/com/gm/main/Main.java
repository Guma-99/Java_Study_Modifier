package com.gm.main;

import com.gm.terran.Marine;
import com.gm.unit.Unit;

public class Main {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		
		m1.setHp(30);
		m1.info();
		m1.move();
		
	}

}
