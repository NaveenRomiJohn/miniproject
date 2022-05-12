package com.chainsys.exception;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		try {
			m2();
		} catch (Exception err) {
			System.out.println("getMessage " + err.getMessage());
			err.printStackTrace();
			/*
			 * Throwable t1=err.getCause(); if(null!=t1) { Class c1=t1.getClass();
			 * System.out.println("Cause "+c1.getName()); } else
			 * System.out.println("Cause is Null");
			 */
		} finally {
			System.out.println("inside m1 finally");
		}
	}

	public static void m2() {
		m3();
	}

	public static void m3() {
		m4();
	}

	public static void m4() {
		int x=0 ,y = 0, z=0;
		x=100;
		z=x/y;
		System.out.println("Result "+z);
		/*
		 * System.out.println("Before try"); int x,y,z=0; String s1,s2=null; Scanner
		 * sc=null; try { sc=new Scanner(System.in); System.out.println("Inside try");
		 * System.out.println("Enter value of X"); s1=sc.nextLine();
		 * System.out.println("Enter value of Y"); s2=sc.nextLine();
		 * x=Integer.parseInt(s1); y=Integer.parseInt(s2); z=x/y;
		 * System.out.println("Result "+ z); }
		 * 
		 * catch(Exception err) { System.out.println("inside catch3 "+err.getMessage());
		 * System.out.println("Error type "+err.getClass().getName()); }
		 * 
		 * catch(ArithmeticException err) {
		 * System.out.println("inside catch1 "+err.getMessage());
		 * System.out.println("Error type "+err.getClass().getName()); }
		 * catch(NumberFormatException err) {
		 * System.out.println("inside catch2 "+err.getMessage());
		 * System.out.println("Error type "+err.getClass().getName()); } catch(Exception
		 * err) { System.out.println("inside catch3 "+err.getMessage());
		 * System.out.println("Error type "+err.getClass().getName()); } finally {
		 * System.out.println("Inside finally"); }
		 * System.out.println("Outside finally");
		 */
	}
}
