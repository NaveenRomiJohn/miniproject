package com.chainsys.collections.list;

public class TestEmp {

	public static void main(String[] args) {
		Emp firstEmp=new Emp(111);
		Emp secondEmp=new Emp(111);
		System.out.println(firstEmp.hashcode());
		System.out.println(secondEmp.hashcode());
		boolean result=firstEmp.equals(secondEmp);
		System.out.println(result);
		result=firstEmp.equals(firstEmp);
		System.out.println(result);
		result=firstEmp.equals("Hello");
		System.out.println(result);
	}

}
