package com.chainsys.introduction;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) 
	{	
		//task1();
		task2();
	}
	public static void task1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println(name);
	}
	public static void task2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the number");
		int number=sc.nextInt();
		sc.close();
		if(number>=18) 
		{
			System.out.println("You are Eligible to vote "+name);
		}
		else 
		{
			System.out.println("Not eligible to vote");
		}
	}
}
