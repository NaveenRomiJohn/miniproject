package com.chainsys.collections.list;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo 
{
	public static void main(String args[])
	{
		ArrayDeque<String> arraydeque=new ArrayDeque<String>();
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X");//duplicate
		arraydeque.push("Z");//duplicate
		arraydeque.push("E");
		arraydeque.push("F");
//		System.out.println("Before Popping the stack: "+arraydeque.size());
//		while(arraydeque.peek() != null)
//		{
//			System.out.println(arraydeque.pop()+" ");
//		}
//			System.out.println(" After popping the stack : "+arraydeque.size());
			Iterator<String> iterator=arraydeque.iterator();
			while(iterator.hasNext())
			{
				System.out.print("\t"+iterator.next());
			}
			System.out.println();
			Iterator<String> striterator=arraydeque.descendingIterator();
			while(striterator.hasNext())
			{
				System.out.print("\t"+striterator.next());
			}
			System.out.println();
			arraydeque.addFirst("H");
			arraydeque.addLast("I");
			iterator=arraydeque.iterator();
			while(iterator.hasNext())
			{
				System.out.print("\t"+iterator.next());
			}
			System.out.println();
			//pollFirst-
			//retrieves and removes the first element of this deque or returns null if this deque is empty
			System.out.println("****pollFirst: "+arraydeque.pollFirst());
			System.out.println(arraydeque);
			System.out.println("****pollLast: "+arraydeque.pollLast());
			System.out.println(arraydeque);
			//peekFirst
			//retrieves but does not removes the first element of this deque or returns null if this deque is empty
			System.out.println("****peekFirst: "+arraydeque.peekFirst());
			System.out.println(arraydeque);
			System.out.println("****peekLast: "+arraydeque.peekLast());
			System.out.println(arraydeque);
			//removeFirst
			//retrieves and removes the first element of this deque.
			//This method differs from pollFirst only in that it throws an exception
			//if this deque is empty
			System.out.println("****removeFirst: "+arraydeque.removeFirst());
			System.out.println(arraydeque);
			System.out.println("****removeLast: "+arraydeque.removeLast());
			System.out.println(arraydeque);
			//--
			System.out.println("****removeFirstOccurence: "+arraydeque.removeFirstOccurrence("X"));
			System.out.println(arraydeque);
			System.out.println("****removeLastOccurence: "+arraydeque.removeLastOccurrence("Z"));
			System.out.println(arraydeque);
		}
	}