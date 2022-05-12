package com.chainsys.unittest;

import com.chainsys.oops.Abstraction;
import com.chainsys.oops.DemoBChild;

public class TestAbstraction 
{
	public static void testDemoB() {
		// abstract class can not be instantiated
//		AbsDemoB objectDemob=new AbsDemoB();
		Abstraction  objectDemob=new DemoBChild();
		objectDemob.echo();
	}
}
