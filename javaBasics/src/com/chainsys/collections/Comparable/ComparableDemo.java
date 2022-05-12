package com.chainsys.collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.chainsys.collections.list.Emp;

public class ComparableDemo 
{
	public static void sortComparable()
	{
	EmpComparable e1=new EmpComparable(100);
	e1.Name="java";
	EmpComparable e2=new EmpComparable(200);
	e2.Name="comparable";
	List<EmpComparable> empList=new ArrayList<>();
	empList.add(e1);
	empList.add(e2);
	Iterator<EmpComparable> empIterator=empList.iterator();
	while(empIterator.hasNext())
	{
		System.out.println(empIterator.next().getID());
	}
	Collections.sort(empList);
	System.out.println();
	
	empIterator=empList.iterator();
	while(empIterator.hasNext())
	{
		System.out.println(empIterator.next().getID());
	}
	EmpNameComparator empComparator=new EmpNameComparator();
	Collections.sort(empList,empComparator);
	System.out.println();
	empIterator=empList.iterator();
	while(empIterator.hasNext())
	{
		EmpComparable emp=empIterator.next();
		System.out.println(emp.getID()+" "+emp.Name);
	}
	}
}
