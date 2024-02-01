package com.kodnest.veichles;

public class MyApp {

	public static void main(String[] args) {

		Veichle veichle = new Bus();
		String mileage = veichle.getMileage();
		System.out.println(mileage);

	}

}
