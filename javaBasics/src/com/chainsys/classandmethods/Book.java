package com.chainsys.classandmethods;
/**
 * 
 * @author nave3121
 *created on: 25 march 2022
 */
public class Book 
{
	private final String title;
	private String author;
	private int publishedYear;
	private int price;
	private String language;
	public Book(String title)
	{
		this.title=title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
