package com.gm.animal;

public class Human {
	private int age;
	
	public int getAge() {
		
		return this.age;
	}

	public void setAge(int age) { //0 - 150 사이의 숫자를 입력하면 그대로 출력 아니면 0 출력
		this.age = 0;
		if(age > 0 && age < 150) {
			this.age = age;
		}
		
//		if (age > 0 && age < 150) {
//			this.age = age;			
//		} else {
//			this.age = 0;
//		}
	}
	
	public void info() {
		System.out.println(this.age);
	}
	
	public void myPet() {
		//Cat cat = new Cat();
		//cat.age = 10;
		//cat.sound();
		
	}
}
