package com.chainsys.exception;

public class example2
{
	public static void m1()
	{
		
	}
	public static void m2()
	{
		
	}
	public static void m3()
	{
		//m(4); we cannot call throws like normal instead we should use try,catch
		try
		{
			m4();
		}
		catch(Exception e)
		{
			System.out.println("Inside catch "+e.getMessage());
			Throwable t1=e.getCause();
			System.out.println("cause "+t1.getMessage());
		}
	}
	public static void m4() throws Exception //we cannot call throws like normal
	{
		Exception e1=new Exception("Error 1");
		//Inner exception
		//e1 is nested inside e2
		Exception e2=new Exception("Error 2",e1);
		//throw e2;
	}
	public static void testM4()
	{
		//m4();
	}
}
