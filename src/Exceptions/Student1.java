package Exceptions;
class Student
{
	void pass() throws InvalidMarkException
	{
		double marks=25.00;
		if(marks>=35)
		{
			System.out.println("Pass");;
		}
		else
		{
			throw new InvalidMarkException ("Fail");
		}
	}
}
class InvalidMarkException extends Exception
{
	String msg;
	InvalidMarkException(String msg)
	{
		this.msg=msg;
		
	}
public String getMessage()
{
	return msg;
	}

}
public class Student1 {
	public static void main(String[] args)
	{
		Student s1= new Student();
		try
		{
			s1.pass();
		}
		catch(InvalidMarkException i)
		{
			System.out.println(i.getMessage());	
		}
	}

}
