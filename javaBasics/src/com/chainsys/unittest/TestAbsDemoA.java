package com.chainsys.unittest;

import com.chainsys.oops.AbsDemoA;
import com.chainsys.oops.DemoAChild;

public class TestAbsDemoA 
{
	public static void testDemoA() {
//		AbsDemoA a1=new AbsDemoA();//abstract class
		AbsDemoA.show();// static method

		DemoAChild b1 = new DemoAChild();// child class
		b1.echo();// parent.echo()
	}
}
