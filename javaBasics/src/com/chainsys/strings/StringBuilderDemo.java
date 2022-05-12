package com.chainsys.strings;
/**
 * 
 * @author nave3121
 *created on: 28 March 2022
 */
public class StringBuilderDemo 
{
	public static void testA()
	{
		String firstString="Hello how are you today. Is the weather hot or cold";
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.ensureCapacity(250);//pre allocate memory
		System.out.println("Length= "+stringBuilder.length());
		System.out.println("Capacity= "+stringBuilder.capacity());
		
		stringBuilder.append(firstString);
		System.out.println("Buffer= "+stringBuilder);
		System.out.println("Length= "+stringBuilder.length());
		System.out.println("Capacity= "+stringBuilder.capacity());
		
		firstString="Wish it rains this week";
		stringBuilder.append(firstString);
		System.out.println("Buffer= "+stringBuilder);
		System.out.println("Length= "+stringBuilder.length());
		System.out.println("Capacity= "+stringBuilder.capacity());
		//reduce capacity to length
		stringBuilder.trimToSize();
		System.out.println("Length= "+stringBuilder.length());
		System.out.println("Capacity= "+stringBuilder.capacity());
		
		stringBuilder.replace(3, 8, "-This is a Test--");
		System.out.println("replace= "+stringBuilder);

		stringBuilder.insert(10,"-This is August-");
		System.out.println("insert= "+stringBuilder);
		System.out.println("Length= "+stringBuilder.length());
		System.out.println("Capacity= "+stringBuilder.capacity());
		
		stringBuilder.delete(5,20);
		System.out.println("delete= "+stringBuilder);
		System.out.println("Length= "+stringBuilder.length());
		System.out.println("Capacity= "+stringBuilder.capacity());
		
		System.out.println("Before reverse: "+stringBuilder);
		stringBuilder.reverse();
		System.out.println("After reverse: "+stringBuilder);
	}
}
