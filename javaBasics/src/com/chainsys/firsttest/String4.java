package com.chainsys.firsttest;
/**
 * 
 * @author nave3121
 *created on: 30 March 2022
 *String s2="Tom and Jerry are good friends"; 
 *1. Write a function that can count the words in a string. 
 *2. Write a function that can reverse the string
 */
public class String4 
{
	public static void main(String[] args)
	{
		countString();
		reverseString();
	}
	public static void countString()
	{
		String input="Tom and Jerry are good friends";
		String[] data=input.split(" ");
		int count=data.length;
		System.out.println("Number of words in the given string is "+count);
		for(int index=0; index<count; index++)
		{
			System.out.println(data[index]);
		}
	}
	public static void reverseString()
	{
		String input="Tom and Jerry are good friends";
		String inputA="";
		char[] charSentence=input.toCharArray();
		System.out.println();
		for(int index=charSentence.length-1; index>=0; index-- )
		{
			inputA=inputA+charSentence[index];
		}
		System.out.println("Reverse String is "+inputA);
	}
}
