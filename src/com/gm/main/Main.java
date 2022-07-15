package com.gm.main;

import com.gm.terran.Marine;
import com.gm.terran.Scv;
import com.gm.unit.Unit;

public class Main {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Scv s1 = new Scv();
		
		// Marine is a Unit
		// Scv    is a Unit
		
		Unit unit = m1;
		System.out.println(unit.getHp());
		System.out.println(unit.getColor());
		System.out.println(unit.getName());
	
		m1 = (Marine)unit;
		
		System.out.println(m1.getWeapon());
		
		m1.setHp(30);
		m1.info();
		m1.move();
		
	}

}
