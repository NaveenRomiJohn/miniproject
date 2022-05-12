package com.chainsys.unittest;

import com.chainsys.oops.Shape;
import com.chainsys.oops.Triangle;

public class TestShape {
	public static void testPolymorphism()
	{
		//Triangle t1=new Shape();
		Triangle s1=new Triangle();
		System.out.println("Tri.HC "+s1.hashCode());
		s1.height=123;
		s1.width=100;
		s1.draw();//shape.draw -final method - not a virtual method
		s1.show();// tri.Show - not a final method
	}
}
