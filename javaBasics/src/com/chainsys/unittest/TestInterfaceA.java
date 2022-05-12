package com.chainsys.unittest;

import com.chainsys.oops.InterfaceA;
import com.chainsys.oops.InterfaceCImpl;

public class TestInterfaceA {
	public static void main(String[] args) 
	{
		InterfaceA.echo();
		InterfaceA a1=new InterfaceCImpl();
		a1.print();
		a1.print("Hello");
	}
}