package Exceptions;

 class Voting {
	void eligibility() throws InvalidAgeException
	{
		int age=45;
		if (age>=18)
		{
			System.out.println("Can Vote");
			
		}
		else
		{
			throw new InvalidAgeException("Cannot vote");	
					
		}
	}

}
 class InvalidAgeException extends Exception
 {
	 String msg;
	 InvalidAgeException(String msg)
	 {
		 this.msg=msg;
	 }
 public String getMessage()
 {
	 return msg;
 }
 }
 public class Voting1
 {
	 
 public static void main(String[] args)
 {
	 Voting v1= new Voting();
	 try
	 {
	v1.eligibility();
	 }
	 catch(InvalidAgeException i1)
	 {
		 System.out.println(i1.getMessage());
	 }
 }
 }
	