package com.chainsys.firsttest;

import java.util.Scanner;

/**
 * 
 * @author nave3121
 * created on: 30 March 2022
 * How will you check if the input name contains only alphabets and
 *  the length of the name is not less than 8 characters. 
 */
public class String7
{
	public static void main(String[] args) 
	{
		//System.out.println(onlyAlphabets("java"));
		checkUser();
	}
	public static String onlyAlphabets(String s)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=scanner.nextLine();
		scanner.close();
		char[] charName=name.toCharArray();
		for(int index=0; index<charName.length; index++)
		{
			if(!(charName[index]>64 && charName[index]<91) && !(charName[index]>96 && charName[index]<123))
			{
				return "The input name does not contains only alphabets";
			}
		}
		return "The input name contains only alphabets";	
	}
	public static void checkUser()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name");
		String userName=scanner.nextLine();
		
		char[] nameAsCharacters=userName.toCharArray();
		int lengthofCharArray=nameAsCharacters.length;
		System.out.println("length of your name is: "+ lengthofCharArray);
		if(lengthofCharArray<8)
		{
			System.out.println("Name must have atleast 8 characters");
		}
		if(lengthofCharArray>=8)
		{
			System.out.println("Name is "+ userName);	
		}
	
		for(int index=0; index<nameAsCharacters.length; index++)
		{
			if(!(nameAsCharacters[index]>64 && nameAsCharacters[index]<91) && !(nameAsCharacters[index]>96 && nameAsCharacters[index]<123))
			{
				System.out.println("The input name does not contains only alphabets"); 
				 return;
			}
		}
		System.out.println("The input name contains only alphabets");
		return;
	}
}
