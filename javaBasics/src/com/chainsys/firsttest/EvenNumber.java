package com.chainsys.firsttest;

import java.util.Scanner;
/**
 * 
 * @author nave3121
 *created on: 30 March 2022
 *Find the even digits in the given number
 */

public class EvenNumber 
{
	public static void main(String[] args) 
	{
		EvenDigits();
	}
	public static void EvenDigits()
	{
		/*
		 * Scanner scanner=new Scanner(System.in);
		 * System.out.println("Enter the number"); long number=scanner.nextInt();
		 * scanner.close();
		 */
		
		long value=1546903;
		long remainder=0;
		System.out.println("The Even digits in given numbers are");
		while(value>0)
		{
			remainder=value%10;
			if(remainder%2==0)
			{
				System.out.println(remainder);
			}
			value=value/10;
		}
	}
}
