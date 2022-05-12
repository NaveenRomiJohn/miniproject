package com.chainsys.unittest;

import com.chainsys.oops.usingFinal.ShapeAPrivateConstructor;

public class TestPrivateConstructor 
{
	public static void testPrivateConstructor() 
	{
		ShapeAPrivateConstructor refShapeA=ShapeAPrivateConstructor.getobject();
		refShapeA.height=123;
		refShapeA.width=500;
		refShapeA.echo();
	}
}
