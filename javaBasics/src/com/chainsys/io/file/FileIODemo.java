package com.chainsys.io.file;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class FileIODemo
{
	public static void main(String[] args) throws IOException 
	{
		//file creation
//		 File file=new File("C:\\Users\\nave3121\\Documents\\Romi");
//		 boolean present=file.exists();
//		 System.out.println("File present: "+present);
//		 if(present == false)
//			 file.mkdir();	//file creation--------file.mkdirs();-subfolders
//		 present=file.exists();
//		 System.out.println("File present: "+present);
		 
		//file creation
//		File file=new File("C:\\Users\\nave3121\\Documents\\Romi\\fileIO.txt");
//		boolean present=file.exists();
//		if(present == false)
//			try
//			{
//			 boolean create= file.createNewFile();
//			 System.out.println("File created: "+ create);
//			}
//			catch(IOException e)
//		 	{
//				e.printStackTrace();
//		 	}
		
		//file deletion
//		File file=new File("C:\\Users\\nave3121\\Documents\\Romi\\fileIO.txt");
//		file.delete();
		
//		File file=new File("C:\\Users\\nave3121\\Documents\\Romi\\fileIO.txt");
//		file.createNewFile();
		
//		File file1=new File("C:\\Users\\nave3121\\Documents\\Romi\\fileIOD.txt");
//		boolean rename=file.renameTo(file1);
//		System.out.println("Rename success: "+rename);
		
//		System.out.println("File name: "+ file.getName());
//		System.out.println("File name: "+ file1.getName());
//		System.out.println(file.canExecute());
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
		
		//list files
//		File file=new File("C:\\Users\\nave3121\\Documents");
//		String[] listFiles=file.list();
//		for(int i=0; i<listFiles.length; i++)
//		{
//			System.out.println(listFiles[i]);
//		}
//		for(String s:listFiles)
//			System.out.println(s);
		
		//list folder
//		File file=new File("C:\\Users\\nave3121\\Documents");
//		File[] fileFolderList=file.listFiles();
//		for(File f: fileFolderList)
//			System.out.println(f);
		
//		File file=new File("C:\\Users\\nave3121\\Documents");
//		File[] fileFolderList=file.listFiles();
//		for(File f: fileFolderList)
//			if(f.isDirectory())
//			System.out.println(f);
	
		File file=new File("C:\\Users\\nave3121\\Documents");
		File[] fileFolderArray=file.listFiles();
		for(File f: fileFolderArray)
		{
			String fileName=f.getName();
			int lastDot=fileName.lastIndexOf(".");
			String extension=fileName.substring(lastDot+1);
			System.out.println(extension);
		}
		
//		int output=reader.read();
//		while(output!= -1)
//		{
//		 System.out.print((char)output);
//		 output=reader.read();
//		}
//		boolean moveFile1=file.renameTo(new File("C:\\Users\\nave3121\\Documents",file.getName()));
//		System.out.println("File Moved: "+moveFile1);
		
		Path moveFile;
		try 
		{
			moveFile = Files.move(Paths.get("C:\\Users\\nave3121\\Documents\\Romi\\fileIO.txt"),
			        				   Paths.get("C:\\Users\\nave3121\\Documents\\fileIO.txt"));
			if(moveFile != null)
			{
	         System.out.println("File moved successfully");
			}
			else
			{
			  System.out.println("Failed to move the file");
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
//		try 
//		{
//			String filePath = "C:\\Users\\nave3121\\Documents\\Romi\\fileIO.txt";
//			Scanner sc = new Scanner(new File(filePath));
//			StringBuffer buffer = new StringBuffer();
//			while (sc.hasNextLine()) 
//			{
//		         buffer.append(sc.nextLine()+System.lineSeparator());
//		    }
//			String fileContents = buffer.toString();
//			System.out.println("Contents of the file: "+fileContents);
//			sc.close();
//			String oldLine = "Java I/O(Input and Output) is used to process the input and produce the output.";
//		    String newLine = "Java Input and Output(I/O) is used to process the input and produce the output.";
//		    fileContents = fileContents.replaceAll(oldLine, newLine);
//			FileWriter writer=new FileWriter(filePath);
//			System.out.println("New data: "+fileContents);
//			writer.append(fileContents);
//		    writer.flush();
//		} 
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
	}
}
