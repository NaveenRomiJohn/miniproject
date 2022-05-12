package com.chainsys.oops.interfaces;
/**
 * 
 * @author nave3121
 *created on: 20 April 2022
 */
public interface IVehicle 
{
	//constant
	public final int MAXSPEED=150;	
	 abstract void echo();
	 abstract void start();
	 abstract void move();
	 abstract void stop();
}
