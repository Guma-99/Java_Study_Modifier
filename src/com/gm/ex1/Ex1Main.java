package com.gm.ex1;

public class Ex1Main {

	public static void main(String[] args) {		
		Iu iu = Iu.getInsance();
		iu.setName("IU");
		iu.setAge(30);
		
		String name = iu.getName();
		
		System.out.println(name);
		System.out.println(iu.getAge());
		System.out.println(iu);
		System.out.println("=======================");
		Iu iu2= Iu.getInsance();
		System.out.println(iu2.getName());
		System.out.println(iu.getAge());
		System.out.println(iu2);
		
	}

}
