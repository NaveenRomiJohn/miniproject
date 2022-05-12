package com.chainsys.exception;

public class Throws
{
	public static void divide() throws Exception
	{
		int a = 4;
		int b = 0;
		int c = a / b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		try {
			divide();
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
