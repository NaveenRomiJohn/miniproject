package com.chainsys.unittest;

import com.chainsys.variables.DemoA;

/**
 * Tester class for
 * @author nave3121
 * @category
 */
public class VariableTester 
{
	public static void testStaticVariable()
	{
		//display the value of static field
		System.out.println("DataA: "+DemoA.DataA);
		//display the value of immutable field
		//System.out.println("DataB: "+DemoA.DataB);
		//display the value of constant field
		System.out.println("DataC: "+DemoA.DataC);
		//modifying value of the static field DataA
		DemoA.DataA=223;
		System.out.println("DataA: "+DemoA.DataA);
		/**modifying value of the static field DataA
		*DemoA.DataC=223;
		*/
	}
	public static void testImmutableVariable()
	{
			/* Cannot make a static refernce to the non static field DemoA.DataB */
			//DemoA.DataB=123;
			/**
			 * first create an object or the class
			 * pass an int value as an argument to the constructor
			 * access the immutable instance field using the object reference
			 */
			DemoA firstObject=new DemoA(123);
			System.out.println(firstObject.DataB);
			/** value assigned to an immutable field cannot be changed
			 *  Value for the immutable field can be assigned through the constructor
			 **/
			//firstObject.DataB=567;
	}
	/**
	 * Calling static method using class name
	 * without creating an object
	 * created on: 25 march 2022
	 */
	public static void testStaticMethod()
	{
		DemoA.sayHello();
	}
	/**
	 * Calling non-static method using object reference
	 * without creating an object,non static members can be called
	 * created on: 25 march 2022
	 */
	public static void testNonStaticMethod()
	{
		//ERROR
		//DemoA.greetUser();
		DemoA firstObject=new DemoA(1111);
		//call the non static method
		firstObject.greetUser();
	}
}
