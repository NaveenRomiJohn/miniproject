package com.chainsys.introduction;

public class Third {

	public static void main(String[] args) 
	{
		byte bMax=127;
		System.out.println("b: "+ bMax);
		byte bMin=-128;
		System.out.println("bMin: "+ bMin);
		short sMax=32767;
		System.out.println("s: "+ sMax);
		short sMin=-32768;
		System.out.println("sMin: "+ sMin);
		int iMax=2147483647;
		System.out.println("iMax: "+iMax);
		int iMin=-2147483648;
		System.out.println("iMin: "+iMin);
		long lMax=9223372036854775807L;
		System.out.println("lMax: "+lMax);
		long lMin=-9223372036854775808L;
		System.out.println("lMin: "+lMin);
		float fMax=2147483648.5432F;
		System.out.println("fMax: "+fMax);
		float fMin=-2147483648.11111F;
		System.out.println("fMax: "+fMin);
		char c1='c';
		System.out.println(c1);
		int ascii=(char)c1;
		System.out.println("Ascii value "+ascii);
		char c2='8';
		System.out.println(c2);
		
		
	}
}
