package com.chainsys.variables;
/**
 * 
 * @author nave3121
 *created on: 25 March 2022
 */
public class Calculator 
{
	/**
	 * Add method: takes 2 integer values using the following parameters,
	 * and will add the values. The totaling will be returned back to the caller
	 * This is a static method, object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
	public static int add(int param1, int param2)
	{
		int result=param1+param2;
		return result;
	}
	/**
	 * multiply method: takes 2 integer values using the following parameters,
	 * and will multiply the values. The totaling will be returned back to the caller
	 * This is a static method, object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
	public static int multiply(int param1, int param2)
	{
		int result=param1*param2;
		return result;
	}
	/**
	 * divide method: takes 2 integer values using the following parameters,
	 * and will divide the values. The totaling will be returned back to the caller
	 * This is a static method, object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
	public static int divide(int param1, int param2)
	{
		 int result=param1/param2;
		 return result;
	}
	/**
	 * subtract method: takes 2 integer values using the following parameters,
	 * and will find the difference between the values. The totaling will be returned back to the caller
	 * This is a static method, object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
	public static int subtract(int param1, int param2)
	{
		int result=param1-param2;
		return result;
	}
	
}
