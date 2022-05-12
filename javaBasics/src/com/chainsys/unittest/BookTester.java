package com.chainsys.unittest;

import com.chainsys.classandmethods.Book;
/**
 * 
 * @author nave3121
 *created on: 25 March 2022
 */
public class BookTester 
{
	public static void testBook()
	{
		Book book=new Book("Romeo and Juliet");
		book.setAuthor("William Shakespeare");
		book.setPublishedYear(1597);
		book.setPrice(3000);
		book.setLanguage("English");
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPublishedYear());
		System.out.println(book.getPrice());
		System.out.println(book.getLanguage());
	}
}
