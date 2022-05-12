package com.chainsys.oops;

public class ImpCalculator implements Calculator
{
	@Override
	public  int add(int v1,int v2)
	{
		int x=v1+v2;
		return x;
	}
	@Override
	public  int multiply(int v1,int v2)
	{
		int x=v1*v2;
		return x;
	}
	@Override
	public int divide(int v1,int v2) throws ArithmeticException
	{int x=0;
		try {
		 x=v1/v2;
		
	}catch(Exception err) {
		System.out.println("Error:"+err.getMessage());
	}
		return x;
	}
}
