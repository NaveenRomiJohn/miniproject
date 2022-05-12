package com.chainsys.collections.Comparable;

import com.chainsys.collections.list.Emp;

public class EmpComparable implements Comparable<EmpComparable>
{
	private final int id;
	public String Name;
	private int age;
	public EmpComparable(int v1)
	{
		id=v1;
	}
	public int getID()
	{
		return id;
	}
	@Override
	public boolean equals(Object obj)
	{
		Class c1=obj.getClass();//provide metadata about the class
		boolean flag=false;
		if(c1==this.getClass())
		{
			EmpComparable other=(EmpComparable) obj;
			if(this.hashCode()==other.hashCode())
				flag=true;
		}
		return flag;
	}
	public int hashcode()
	{
		return this.id;
	}
	public int compareTo(EmpComparable other)
	{
		int result=0;
		result=Integer.compare(this.getID(), other.getID());
		return result;
	}
}
