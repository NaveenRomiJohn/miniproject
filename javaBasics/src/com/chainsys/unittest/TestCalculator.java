package com.chainsys.unittest;

import com.chainsys.oops.Calculator;
import com.chainsys.oops.ImpCalculator;

public class TestCalculator {

	public static void main(String[] args) 
	{
		Calculator c1=new ImpCalculator();
		System.out.println("Addition of two value is "+ c1.add(1, 2));
		System.out.println("Multiplication of two value is "+ c1.multiply(2, 3));
		System.out.println("Division of two value is "+c1.divide(4,0));
//		try 
//		{
//			System.out.println("Division of two value is "+c1.divide(4,2));
//		}
//		catch(ArithmeticException ae)
//		{
//		 System.out.println("Please enter v2 value > 0");
//		}
	}
}
