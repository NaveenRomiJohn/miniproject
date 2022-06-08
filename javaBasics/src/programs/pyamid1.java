package programs;

public class pyamid1
{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    pyamid1(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
   // void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    	pyamid1 s1 = new pyamid1(111,"Karan");  
    	pyamid1 s2 = new pyamid1(222,"Aryan");  
    //calling method to display the values of object  
    System.out.println(s1);
   // s2.display();  
   }  
}  