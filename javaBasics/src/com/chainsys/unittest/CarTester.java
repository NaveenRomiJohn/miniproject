package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;

public class CarTester 
{
	public static void testCar()
	{
		Car firstCar=new Car("TN 10 A 009");
		firstCar.setColor("Blue");
		firstCar.setFuel("Petrol");
		firstCar.setYearOfPurchase(2022);
		System.out.println(firstCar.getRegNo());
		System.out.println(firstCar.getColor());
		System.out.println(firstCar.getFuel());
		System.out.println(firstCar.getYearOfPurchase());
	}
}
