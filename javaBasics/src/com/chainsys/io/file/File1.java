package com.chainsys.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 
{
	public static void main(String[] args) 
	{    
		//createFile();
		//demo1();
		fis();
    }  
	public static void createFile()
	{
		try 
        {  
            File file = new File("javaFile123.txt");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } 
            else {  
                System.out.println("File already exists.");  
            }  
        } 
        catch (IOException e) {  
            e.printStackTrace();  
        }
	}
	public static void demo1()
	{
		String path = "";  
        boolean bool = false;  
        try {  
            // creating  new files  
            File file  = new File("testFile1.txt");  
            file.createNewFile();  
            System.out.println(file);  
            // creating new canonical from file object  
            File file2 = file.getCanonicalFile();  
            // returns true if the file exists  
            System.out.println(file2);  
            bool = file2.exists();  
            // returns absolute pathname  
            path = file2.getAbsolutePath();  
            System.out.println(bool);  
            // if file exists  
            if (bool) {  
                // prints  
                System.out.print(path + " Exists? " + bool);  
            }  
        } catch (Exception e) {  
            // if any error occurs  
            e.printStackTrace();  
        } 
	}
	
	/*
	 * Java FileOutputStream is an output stream used for writing data to a file.
	 * If you have to write primitive values into a file, use FileOutputStream class.
	 * You can write byte-oriented as well as character-oriented data through FileOutputStream class.
	 * But,for character-oriented data, it is preferred to use FileWriter than FileOutputStream.
	 */ 
	public static void fos()
	{
		try{    
            FileOutputStream fout=new FileOutputStream("C:\\Users\\nave3121\\eclipse-workspace\\javaBasics\\testFile1.txt");    
            String s="Welcome";    
            byte b[]=s.getBytes();//converting string into byte array  
            fout.write(b);    
            fout.close();    
            System.out.println("success...");    
           }
		catch(Exception e)
			{System.out.println(e);}    
     } 

		/*
		 * Java FileInputStream class obtains input bytes from a file. It is used for
		 * reading byte-oriented data (streams of raw bytes) such as image data, audio,
		 * video etc. You can also read character-stream data. But, for
		 * reading streams of characters, it is recommended to use FileReader class.
		 */ 
	public static void fis()
	{
		 try{    
	            FileInputStream fin=new FileInputStream("C:\\Users\\nave3121\\eclipse-workspace\\javaBasics\\testFile1.txt");    
	            int i=0;  
	            while((i=fin.read())!=-1)
	            {    
	            	System.out.print((char)i);    
	            }
	            fin.close();    
	          }
		 catch(Exception e)
		 {System.out.println(e);} 
	}

}
