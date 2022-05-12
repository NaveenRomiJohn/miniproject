package com.chainsys.variables;

import java.util.Scanner;
/**
 * 
 * @author nave3121
 * 25 March 2022
 */
public class Bank 
{	
	public static int accountBalance=1000;
	public static String customerName;
	public static long accountNumber;
	
	public static void deposit(int amount)
	{
		accountBalance=amount+accountBalance;
		
	}
	public static int withdraw(int amount)
	{
		accountBalance=accountBalance-amount;
		return accountBalance;
	}
	public static void openAccount(String name, long accountNumber1)
	{
		customerName=name;
		accountNumber=accountNumber1;
	}
}
