package com.chainsys.firsttest;

public class FizzBuzz 
{
	public static void main(String[] args) 
	{
		printFizzBuzz();
	}
	public static void printFizzBuzz()
	{
	      for (int count = 1; count <=100 ; count++) 
	      {
	        if(count%15==0)
	                System.out.print("Fizz Buzz,");
	        else if(count%3==0)
	                System.out.print("Fizz,");
	        else if(count%5==0)
	        		System.out.print("Buzz,");
	        else
	                System.out.print(count + ",");
	      }
	}
}

