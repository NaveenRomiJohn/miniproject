package com.chainsys.collections.list;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo 
{
	public static void main(String args[])
	{
		Stack<Integer> st=new Stack<Integer>();
		System.out.println("stack: "+st.size());
		st.push(42);
		st.push(66);
		st.push(99);
		System.out.println("stack: "+st.size());
		Iterator<Integer> int_itr=st.iterator();
		while(int_itr.hasNext())
		{
			System.out.println(int_itr.next());
		}
		System.out.println();
		Integer a=st.pop();
		System.out.println(a);
		System.out.println("After POP stack: "+st.size());
		a=st.pop();
		System.out.println(a);
		System.out.println("After POP stack: "+st.size());
		a=st.pop();
		System.out.println(a);
		System.out.println("After POP stack: "+st.size());
		try
		{
			a=st.pop();
			System.out.println(a);
		}
		catch(EmptyStackException e)
		{
			System.out.println("Empty stack: "+e.getMessage());
		}
	}
}
