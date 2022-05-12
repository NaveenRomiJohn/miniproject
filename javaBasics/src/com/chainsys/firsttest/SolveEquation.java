package com.chainsys.firsttest;
/**
 * 
 * @author nave3121
 *created on:30 March 2022
 *Solve the equation 2x2 + x + 5 for all numbers between 5 and 10 for x
 */
public class SolveEquation
{
	public static void main(String[] args) 
	{
		solvingEquation();
	}
	public static void solvingEquation()
	{
		for(int count=5; count<=10; count++)
		{
			long equation=((2*(count*count))+count+5);
			System.out.println("For number "+count+" the equation is "+equation);
		}
	}
}
