package com.chainsys.thread;

public class Worker 
{
	public int amount = 0; //global variable

	public void callme() 
	{
		long currentthreadid = Thread.currentThread().getId();
		System.out.println("Inside Callme thread ID " + currentthreadid);
		// int amount=0;
		try 
		{
			for (int i = 0; i < 5; i++) 
			{
				amount += i;
				System.out.println(currentthreadid + "  " + amount);
				Thread.sleep(1000);
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
