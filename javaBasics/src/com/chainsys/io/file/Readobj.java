package com.chainsys.io.file;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.chainsys.collections.list.Emp;

public class Readobj
{
    public static void main(String arg[])throws Exception
    {
         FileInputStream fis = 
                 new FileInputStream("C:\\Users\\nave3121\\Documents\\Romi\\serial.txt") ;
         ObjectInputStream ois = new ObjectInputStream(fis) ;
          Emp ob =null;
         try
        {
            ob = (Emp) ois.readObject();
        }
        catch(Exception e)
        {
            System.out.println("Exception during deserialization: " +e);
        }
        finally
        {
            try
            {
                ois.close();
            }
            catch(Exception e)
            {
                System.out.println("Exception during ois close: " + e);
            }
        }
        if(null!=ob)
        {
        	System.out.println(ob.getID() +" "+ ob.Name);
            System.out.println("HashCode "+ob.hashCode());            
        }
    }
}
