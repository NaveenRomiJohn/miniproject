package com.chainsys.firsttest;

public class Student 
{
	int studentID;
	String name;
	String dateOfBirth;
	String bloodGroup;
	double height;
	int marks;
	
	public Student(int studentID, String name, String dateOfBirth, String bloodGroup, double height, int marks) 
	{
		this.studentID = studentID;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.bloodGroup = bloodGroup;
		this.height = height;
		this.marks = marks;
	}
	public void display()
	{
		System.out.println("Student ID is    "+ studentID);
		System.out.println("Student Name is  "+name);
		System.out.println("Date Of Birth is "+dateOfBirth);
		System.out.println("Blood Group is   "+bloodGroup);
		System.out.println("Height is        "+height);
		System.out.println("Marks is         "+marks);
	}
	public static void main(String[] args) 
	{
		Student student=new Student(101,"Romi","09 june 1998","B+",6.2,431);
		student.display();
	}
}
