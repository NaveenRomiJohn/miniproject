package com.chainsys.firsttest;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		armstrongCheck();
	}
	public static void armstrongCheck()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		scanner.close();
		int value=number;
		int next=0;
		while(value>0)
		{
			int remainder = value%10;
			int cube=remainder*remainder*remainder;
			next=cube+next;
			value=value/10;
		}
		
		if(next==number)
		{
			System.out.println("Same as input number");
		}
		else
		{
			System.out.println("Different number");
		}
	}
}
