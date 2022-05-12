package com.chainsys.introduction;

public class Fifth {

	public static void main(String[] args) 
	{	
		printTriangle();
	}
	public static void printNumbers()
	{
		int numberA=0;
		for(numberA=0;numberA<=100;numberA++)
		{
			System.out.print(numberA+" ");
		}
	}
	public static void printNumbersReverse()
	{
		int numberB=0;
		for(numberB=10;numberB>=1;numberB--)
		{
			System.out.print(numberB+" ");
		}
	}
	public static void printMatrix()
	{
		int countA=0;
		for(countA=1;countA<=5;countA++)
		{
		  for(int countB=1;countB<=20;countB++)
		  {
			System.out.print(countB+" ");
		 }
		 System.out.println();
		}
	}
	public static void printTriangle()
	{
		int countA=0;
		for(countA=1;countA<=10;countA++)
		{
		  for(int countB=1;countB<countA;countB++)
		  {
			System.out.print(".");
		  }
		  for(int countC=countA;countC>=1;countC--)
		  {
			System.out.print(countC);
		  }
		 System.out.println();
		}
	}
}
