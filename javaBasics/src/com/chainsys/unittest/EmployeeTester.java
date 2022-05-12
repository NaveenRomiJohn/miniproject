package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;
/**
 * 
 * @author nave3121
 *created on: 25 March 2022
 */
public class EmployeeTester
{
	public static void testName()
	{
		Employee firstEmployee=new Employee(123);
		firstEmployee.setName("Naveen");
		System.out.println(firstEmployee.getName());
	}
	public static void testCity()
	{
		Employee firstEmployee=new Employee(123);
		firstEmployee.setCity("Chennai");
		System.out.println(firstEmployee.getCity());
	}
	public static void testSalary()
	{
		Employee firstEmployee=new Employee(123);
		firstEmployee.setSalary(50000);
		System.out.println(firstEmployee.getSalary());
	}
}
