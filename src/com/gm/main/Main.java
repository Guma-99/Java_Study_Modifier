package com.gm.main;

import com.gm.himart.Client;
import com.gm.himart.Computer;
import com.gm.himart.Phone;
import com.gm.himart.Tv;

public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Phone phone = new Phone();
		Tv tv = new Tv();

		computer.info();
		System.out.println("");
		phone.info();
		System.out.println("");
		tv.info();
		System.out.println("");
		
		Client client = new Client();
		client.buy(computer);
	}

}
