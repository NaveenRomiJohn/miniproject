package com.chainsys.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * created on: 21 April 2022
 * @author nave3121
 *
 */
public class ListArrayListDemo 
{
	public static void usingStringArrayList()
	{
		
		//System.out.println("Initial size of stringArrayList: "+stringArrayList.size());
		try
		{
			Emp e1=new Emp(100,"");
			e1.Name="java";
			Emp e2=new Emp(100,"");
			e2.Name="java";
			List<Emp> stringArrayList=new ArrayList<>();
			stringArrayList.add(e1);
			stringArrayList.add(e2);
			System.out.println(stringArrayList);
			//Collections.sort(stringArrayList);
//			stringArrayList.add("Car");
//			stringArrayList.add("Auto");
//			stringArrayList.add("Egg");
//			stringArrayList.add("Box");
//			stringArrayList.add("Doll");
//			stringArrayList.add("Fan");
//			//will insert a new value
//			//pushing the current value of index 1 to the next index
//			stringArrayList.add(1,"Animal");
//			stringArrayList.add("Girl");
//			stringArrayList.add("Fan");
			
			//System.out.println(stringArrayList);
			//ListIterator<String> itr1=stringArrayList.listIterator();
//			while(itr1.hasPrevious())  
//            {    
//               // System.out.println(itr1.previous());  
//            }  
//			//Collections.sort(stringArrayList);
//			
//			for(String lists:stringArrayList)
//			{
//				//System.out.println(lists);
//			}
//			Iterator<String> itr=stringArrayList.iterator();
//			while(itr.hasNext())
//			{
//				//System.out.println(itr.next());
//			}
			
			
			
			
//			System.out.println("size of stringArrayList after additions: "+stringArrayList.size());
//			System.out.println("Contents of stringArrayList: "+stringArrayList);
//			//will replace the value in index 2
//			stringArrayList.set(2,"xenas");
//			System.out.println("After set(2): "+stringArrayList);
//			System.out.println("Last Index of: 'Fan' "+stringArrayList.lastIndexOf("Fan"));
//			//remove the first instance of'Fan'
//			stringArrayList.remove("Fan");
//			stringArrayList.remove(2);
//			System.out.println("size after remove(2): "+stringArrayList.size());
//			System.out.println("Contents of stringArrayList: "+stringArrayList);
//			//will reduce the capacity
//			stringArrayList.trimToSize();
//			System.out.println(stringArrayList.get(5));
//			System.out.println(stringArrayList.isEmpty());
//			System.out.println(stringArrayList.lastIndexOf("Girl"));
//			System.out.println(stringArrayList.spliterator());
//			System.out.println(stringArrayList.subList(0, 3));
//			System.out.println();
		}
		catch(Exception err)
		{
			System.out.println(err.getMessage());
		}
		
		
		
	}
}
