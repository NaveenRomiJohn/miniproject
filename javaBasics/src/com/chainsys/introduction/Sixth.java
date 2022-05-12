package com.chainsys.introduction;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) 
	{
		swapNumbers();
	}
	public static void checkUser()
	{
		Scanner sc=new Scanner(System.in); //input stream
		//prompt a message in display console
		System.out.println("Enter your Name");
		//get name from the keyboard and store the name in a local variable
		String userName=sc.nextLine();
		sc.close(); //closing the input stream
		//streams are created and managed by OS, scanner is just a handle
		System.out.println("Name is "+ userName); //display the input value received
		char[] nameAsCharacters=userName.toCharArray();
		int lengthofCharArray=nameAsCharacters.length;
		System.out.println("length of your name is: "+ lengthofCharArray);
		if(lengthofCharArray<3)
		{
			System.out.println("Name must have atleast 3 characters");
			return;
		}
		if(lengthofCharArray>15)
		{
			System.out.println("Name must not have more than 15 characters");
			return;
		}
		//ascii value for alphabets is 65 to 90 Upper case
		String nameInUppercase=userName.toUpperCase();
		//remove blank space before and after the name
		nameInUppercase=nameInUppercase.trim();
		char[] uppercaseCharArray=nameInUppercase.toCharArray();
		lengthofCharArray=uppercaseCharArray.length;
		int ascii=0;
		for(int index=0;index<lengthofCharArray;index++)
		{
			ascii=(int)uppercaseCharArray[index];
			System.out.println("ASCII: "+ ascii);
			if(ascii < 65 || ascii > 90)
			{
				if(ascii != 32)
				{
					System.out.println("IN Valid character in Name");
					return;
				}
			}
		}
	}
	public static void findEvenNumbers()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 10 digit number");
		long value=sc.nextLong();
		sc.close();
		long num=value;
		long reminder=0;
		while(num>0)
		{
			reminder=num%10;
			if(reminder%2==0)
			{
				System.out.println(reminder);
			}
			num=num/10;
		}
	}
	public static void swapNumbers()
	{
		int x=23;
		int y=45;
		System.out.println("X: "+x+" Y: "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("X: "+x+" Y: "+y);
	}
}
