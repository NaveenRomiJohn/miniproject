package com.chainsys.unittest;

import com.chainsys.firsttest.Branch;
import com.chainsys.firsttest.Customer;
import com.chainsys.firsttest.BankEmployee;
import com.chainsys.firsttest.customerAccountDetails;
public class TestBank 
{
	public static void TestBranch()
	{
	 Branch b=new Branch(100);
	 System.out.println(b.getId());
	 b.setLocation("Ayanambakkam");
	 System.out.println(b.getLocation());
	 b.setManagerId(3121);
	 System.out.println(b.getManagerId());
	 System.out.println(b.getBankName());
	}
	public static void TestCustomer()
	{
	 Customer c=new Customer(1);
	 System.out.println(c.getId());
	 c.setName("Naveen");
	 System.out.println(c.getName());
	 c.setPhone_number(8122410442L);
	 System.out.println(c.getPhone_number());
	 c.setAddress("Dindigul");
	 System.out.println(c.getAddress());
	 c.setE_mail_address("naveen@gmail.com");
	 System.out.println(c.getE_mail_address());
	}
	public static void TestBankEmployee()
	{
		BankEmployee be=new BankEmployee(1);
		System.out.println(be.getId());
		 be.setName("Naveen");
		 System.out.println(be.getName());
		 be.setPhone_number(8122410442L);
		 System.out.println(be.getPhone_number());
		 be.setAddress("Dindigul");
		 System.out.println(be.getAddress());
		 be.setE_mail_address("naveen@gmail.com");
		 System.out.println(be.getE_mail_address());
	}
	public static void customerAccountDetails()
	{
		customerAccountDetails cad=new customerAccountDetails(1,3121);
		System.out.println(cad.getCustomer_id());
		System.out.println(cad.getAccount_number());
		cad.setAccount_type("Savings");
		System.out.println(cad.getAccount_type());
		cad.setCurrent_balance(50000);
		System.out.println(cad.getCurrent_balance());
	}
}
