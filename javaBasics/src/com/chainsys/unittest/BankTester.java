package com.chainsys.unittest;

import com.chainsys.variables.Bank;
/**
 * 
 * @author nave3121
 *
 */
public class BankTester 
{
	public static void testDeposit()
	{
		System.out.println("Before Deposit Balance "+Bank.accountBalance);
		Bank.deposit(1000);
		System.out.println("After Deposit Balance "+Bank.accountBalance);
	}
	public static void testWihdraw()
	{
		System.out.println("Before Withdraw Balance "+Bank.accountBalance);
		int withdraw=Bank.withdraw(500);
		System.out.println("Total amount is " + withdraw);
		System.out.println("After Withdraw Balance "+Bank.accountBalance);
	}
	public static void testOpenAccount()
	{
		Bank.openAccount("Naveen",123456789);
		System.out.println(Bank.customerName);
		System.out.println(Bank.accountNumber);
	}
}
