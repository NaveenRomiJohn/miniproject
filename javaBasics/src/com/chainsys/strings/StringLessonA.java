package com.chainsys.strings;

import java.util.Scanner;
/**
 * 
 * @author nave3121
 *created on: 28 March 2022
 */
public class StringLessonA 
{
	public static void lessonOne()
	{
		String firstString="Chainsys";
		System.out.println(firstString);
		char dataOne[]={'C','h','a','i','n'};
		String secondString=new String(dataOne);
		System.out.println(secondString);
		String thirdString=new String(new char[]{'C','h','a','i','n'});
		System.out.println(thirdString);	
	}
	public static void lessonTwo()
	{
		String firstString="Hello";
		String secondString="Hello";
		String thirdString="Hello";
		int firstNumber=100;
		int secondNumber=100;
		int thirdNumber=100;
		
		System.out.println(firstString);
		System.out.println(secondString);
		firstString="Welcome";
		System.out.println(firstString);
		System.out.println(secondString);
	}
	public static void creatingStringInaForLoop()
	{
		for(int count=0;count<10;count++)
		{
			String s1="Hello";
		}
	}
	public static void stringToCharArray()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a WORD");
		String firstString=scanner.nextLine();
		scanner.close();
		int stringLength=firstString.length();
		System.out.println("Length "+stringLength);
		char[] data=firstString.toCharArray();
		int dataArrayLength=data.length;
		System.out.println("Length "+dataArrayLength);
	}
	public static void stringToUpperLower()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a WORD");
		String firstString=scanner.nextLine();
		scanner.close();
		System.out.println(firstString);
		String stringInUppercase=firstString.toUpperCase();
		System.out.println("toUpperCase= "+stringInUppercase);
		
		System.out.println("s1= "+firstString);
		String stringInLowercase=firstString.toLowerCase();
		System.out.println("toLowerCase= "+stringInLowercase);
		System.out.println("s1= "+firstString);
		//substring
		//from the 4th char till end
		String subString=firstString.substring(3);
		System.out.println(subString);
		//from 3rd char to 6th char(i.e excluding 7th char)
		//from index 2 to 5
		subString=firstString.substring(2, 6);
		System.out.println(subString);
		//replace
		String replacedString=firstString.replace('e', 'a');
		System.out.println(replacedString);	
		//equals
		boolean flag1=firstString.equals(stringInUppercase);
		System.out.println(flag1);
		
		boolean flag=firstString.equalsIgnoreCase(stringInUppercase);
		System.out.println(flag);
	}
	public static void testStringTrim()
	{
		String secondString="  Hope   it    rain    ";
		System.out.println("Before Trim: "+secondString.length());
		secondString=secondString.trim();
		System.out.println("After Trim: "+secondString.length());
		System.out.println(secondString);
	}
	public static void testSplitDays()
	{
		String weekDays="Mon;Tue;Wed;Thu;Fri;Sat;Sun";
		String trimmedString= weekDays.trim();
		String[] data=trimmedString.split(";");
		int count=data.length;
		System.out.println("Days count: "+count);
		for(int index=0; index<count; index++)
		{
			System.out.println(data[index]);
		}
	}
	public static void reverse()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence="";
		String sentenceA="";
		try
		{
			sentence=scanner.nextLine();
		}
		finally
		{
			scanner.close();
		}
		char[] charSentence=sentence.toCharArray();
		for(int index=charSentence.length-1; index>=0; index-- )
		{
			sentenceA=sentenceA+charSentence[index];
		}
		System.out.println(sentenceA);
	}
	public static void verifyString(String s1)
	{
		if(null==s1)
		{
			System.out.println("String is Null");
			return;
		}
		else
		{
			System.out.println("String is NOT Null "+ s1);
		}
		if(!s1.isEmpty())
			System.out.println("\t Not Empty "+s1);
		else
			System.out.println("\t String is Empty");
	}
}
