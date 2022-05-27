package programs;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;

public class ex1 {
	public static boolean checkStringForParseInt(String data) throws InvalidInputDataException{   
		   boolean result =false; 
		   for (int i = 0; i < data.length(); i++) 
		   {
			   if (!(data.charAt(i) >= '0' && data.charAt(i) <= '9'))
			   {
				   throw new InvalidInputDataException("The value in string must contain only numbers ");   
		       }   
		   }
		   return result;
	   }
	   public static boolean checkNumberForGreaterThanZero(int data) throws InvalidInputDataException{   
		   boolean result =false;
		   if(data<=0)
		   {
			   throw new InvalidInputDataException("The value must be greater then zero");
		   }
		   return result;
	   } 
	   public static boolean checkNameContainsOnlyString(String data) throws InvalidInputDataException{   
		   boolean result =false; 
		   for (int i = 0; i < data.length(); i++) 
		   {
			   if (data.charAt(i) >= '0' && data.charAt(i) <= '9')
			   {
				   throw new InvalidInputDataException("The value in string must contain only alphabets ");   
		       }   
		   }
		   return result;
	   }
	   public static boolean validateEmail(String email) throws InvalidInputDataException {
		   boolean result =false;
		    if (email == null) {
		        throw new InvalidInputDataException("Email is null");
		    }
		    if (!email.contains("@")) {
		        throw new InvalidInputDataException("Email must contain @sign");
		    }
		    return result;		   
		}
//	   public static boolean phoneNumberNotValid(long phoneNumber) throws InvalidInputDataException{   
//		   boolean result =false;
//		   if(phoneNumber

}
