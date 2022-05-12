package com.chainsys.firsttest;

import java.util.Scanner;

public class ClimateCheck 
{
	public static void main(String[] args)
	{
		climateCheck();
	}
	public static void climateCheck()
	{
       Scanner scanner=new Scanner(System.in);
       System.out.println("Hi! How can i help you");
       String string1 =scanner.nextLine();
       if(string1.contains("raining"))
       {
    	   System.out.println("Get an Umbrella with you"); 
       }
       else
       {
           System.out.println("There is no rain walk safely");
           return;
       }
       System.out.println("Enter Today Temperature");
       int temp =scanner.nextInt();
       scanner.close();
   
       if (temp<32)
       {
           System.out.println("Bring a Heavy Jacket");  
       }
       else if((temp>=32) && (temp<=50))
       {
            System.out.println("Bring a Light Jacket");   
       }
       else
       {
            System.out.println("There is no need of Jacket");  
       }
  }
}

