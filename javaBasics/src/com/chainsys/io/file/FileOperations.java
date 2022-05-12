package com.chainsys.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
//1. createNewFile
//2. renameFile
//3. appendDataToFile
//4. modifyDataInFile
//5. readDataFromFile
//6. deleteFile
//7. copyFile
//8. moveFile
public class FileOperations 
{
	static File file=new File("C:\\Users\\nave3121\\Documents\\Romi\\fileIO.txt");
	public static void createNewFile()
	{
		boolean present=file.exists();
		if(present == false)
			try
			{
			 boolean create= file.createNewFile();
			 System.out.println("File created: "+ create);
			}
			catch(IOException e)
		 	{
				e.printStackTrace();
		 	}
	}
	public static File renameFile()
	{
		File fileNew=new File("C:\\Users\\nave3121\\Documents\\Romi\\fileInputOutput.txt");
		boolean rename=file.renameTo(fileNew);
		if(rename == true)
		{
         System.out.println("File renamed successfully");
		}
		return fileNew;
	}
	public static void appendDataToFile()
	{
		try 
		{
			FileWriter writer=new FileWriter("C:\\Users\\nave3121\\Documents\\Romi\\fileInputOutput.txt", true);
			writer.write("Javaa I/O(Input and Output) is used to process the input and produce the output.");
			writer.flush();
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public static void modifyDataInFile() throws IOException
    {
         String filePath = "C:\\Users\\nave3121\\Documents\\Romi\\fileInputOutput.txt";
         Scanner sc = new Scanner(new File(filePath));
         StringBuffer buffer = new StringBuffer();
         while (sc.hasNextLine()) 
         {
          buffer.append(sc.nextLine()+System.lineSeparator());
         }
         String fileContents = buffer.toString();
         System.out.println("Contents of the file: "+fileContents);
         sc.close();
         String oldLine ="Javaa";
         String newLine = "Java";
         fileContents = fileContents.replaceAll(oldLine, newLine);
         FileWriter writer = new FileWriter(filePath);
         System.out.println("new data: "+fileContents);
         writer.append(fileContents);
         writer.flush();
     }
	public static File sharing()
	{    
        return  renameFile(); 
    }
	public static void readDataFromFile()
	{
		try 
		{
			File fileNew=sharing();
			FileReader reader = new FileReader(fileNew);
			char[] ch=new char[(int) fileNew.length()];
			//System.out.println(ch.length);
			reader.read(ch);
			for(char c: ch)
			{
				System.out.print(c);
			}
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public static void deleteFile()
	{
		boolean deletion=file.delete();
		System.out.println("File deleted"+deletion);
	}
	public static void copyFile()
	{
		try 
		{
			InputStream input=new FileInputStream("C:\\Users\\nave3121\\Documents\\Romi\\fileInputOutput.txt");
			OutputStream output=new FileOutputStream("C:\\Users\\nave3121\\Documents\\Romi\\fileIO_copy.txt");
			int content=input.read();
			while(content != -1)
			{
				output.write(content);
				content=input.read();
			}
			output.flush();
			System.out.println("File copied to other file successfully");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public static void moveFile()
	{
		File fileNew=sharing();
		boolean moveFile1=fileNew.renameTo(new File("C:\\Users\\nave3121\\Documents",fileNew.getName()));
		if(moveFile1 == true)
		{
         System.out.println("File moved successfully");
		}
		else
		{
		  System.out.println("Failed to move the file");
		}
	}
	
	//main method
	public static void main(String args[]) throws IOException
	{
		int callMethod=8;
		switch(callMethod)
		{
		case 1:
			createNewFile();
			break;
		case 2:
			renameFile();
			break;
		case 3:
			appendDataToFile();
			break;
		case 4:
			modifyDataInFile();
			break;
		case 5:
			readDataFromFile();
			break;
		case 6:
			deleteFile();
			break;
		case 7:
			copyFile();
			break;
		case 8:
			moveFile();
			break;
		}
	}
}