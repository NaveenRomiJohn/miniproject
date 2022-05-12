package com.chainsys.exception;

public class Throw {
	static void checkAge(int age)
	{
		try 
		{
			if (age < 18) {
				throw new ArithException("Access denied - You must be at least 18 years old.");
			}
		}
		catch(ArithException a)
		{
			
		}
	  }
	public static void main(String[] args) 
	{
	    checkAge(16); // Set age to 15 (which is below 18...)
	  }
}
