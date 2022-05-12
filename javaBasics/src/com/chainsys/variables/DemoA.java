package com.chainsys.variables;

public class DemoA 
{	//static global variable
	public static int DataA;
	//immutable global variable(non static)
	public final int DataB;
	//constant
	public final static int DataC=300;
	private int dataD;
	
	/* Constructor
	 * Constructor is a special method
	 * The name of the constructor and the name of the class will be same
	 * Constructor don't have return type
	 * Constructors can take parameters
	 */
	public DemoA(int dataB)
	{
		/*Assigning value to the global read only field (this.DataB) */
		this.DataB=dataB;
	}
	/**
	 * Static method can be called without an object
	 */
	public static void sayHello()
	{
		System.out.println("Hello Developer");
	}
	/**
	 * greet user is a non-static method
	 * this is a member method
	 * requires an object to call this method
	 */
	public void greetUser()
	{
		System.out.println("Greetings USER");
	}
}
