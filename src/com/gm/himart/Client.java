package com.gm.himart;

import com.gm.himart.Unit;

public class Client extends Unit{
	private int money;
	private int point;

	public Client() {
		this.money = 30000000;
		this.setPoint(10);
	}
	
	public void buy(Tv tv) {
		this.money = this.money - tv.getPrice();
		this.point = this.point + tv.getPoint();
		System.out.println("잔액: " + this.money);
		System.out.println("Point: " + this.point);
	}
	

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}
