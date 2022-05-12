package com.chainsys.exception;

public class TryCatch {
	public static void divide() {
		int a = 4;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} 
		catch (Exception e) {
			System.out.println("Enter the b number > 0");
		}
	}
	public static int divide1() {
		int c=0;
		try {
			int a = 4;
			int b = 2;
			c = a / b;
			System.out.println(c);
		} 
		catch (Exception e) {
			System.out.println("Enter the b number > 0");
		}
		return c;
	}

	public static void main(String[] args) {
		divide1();
	}
}
