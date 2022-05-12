package com.chainsys.unittest;

import com.chainsys.variables.Calculator;
/**
 * This class is for unit testing the calculator class and its methods
 *<list>
 *add(param1)
 *multiply(param1)
 *divide(param1)
 *subtract(param1)
 * @author nave3121
 *created on: 25 March 2022
 */
public class CalculatorTester 
{
	public static void testAdd()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.add(arg1, arg2);
		System.out.println("Result is "+output); 
		//System.out.println("Addition of two numbers is "+Calculator.add(2, 7));
	}
	public static void testMultiply()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.multiply(arg1, arg2);
		System.out.println("Result is "+output);
		//System.out.println("Multipliaction of two numbers is "+Calculator.multiply(2, 7));
	}
	public static void testDivide()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.divide(arg1, arg2);
		System.out.println("Result is "+output);
		//System.out.println("Division of two numbers is "+Calculator.divide(2, 7));
	}
	public static void testSubtract()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.subtract(arg1, arg2);
		System.out.println("Result is "+output);
		//System.out.println("Subtraction of two numbers is "+Calculator.subtract(2, 7));
	}
}
