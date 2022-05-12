package com.chainsys.collections.list;

import java.io.Serializable;

/**
 * created on: 21 April 2022
 * @author nave3121
 *
 */
public class Emp  implements Serializable
{
	private final int id;
	public String Name;
	public Emp(int v1, String sName)
	{
		id=v1;
		Name=sName;
	}
	public int getID()
	{
		return id;
	}
	public String Name()
	{
		return Name;
	}
	@Override
	public boolean equals(Object obj)
	{
		Class c1=obj.getClass();//provide metadata about the class
		boolean flag=false;
		if(c1==this.getClass())
		{
			Emp other=(Emp) obj;
			if(this.hashCode()==other.hashCode())
				flag=true;
		}
		return flag;
	}
	public int hashcode()
	{
		return this.id;
	}
}
