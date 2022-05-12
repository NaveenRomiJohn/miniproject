package com.chainsys.firsttest;

public class Triangle 
{
	public static void main(String[] args) 
	{
		triangleTest();
	}
	public static void triangleTest()
	{
		 int countA, countB, countC, countD;

         for (countA = 1; countA <= 9; countA++) {

                 for (countB = 1; countB <= 9 - countA; countB++) {
                         System.out.print(".");
                 }
                 for (countC = countA; countC >= 1; countC--) {
                         System.out.print(countC);
                 }
                 for (countD = 2; countD <= countA; countD++) {
                         System.out.print(countD);
                 }
                 System.out.println();
	}
 }
}
