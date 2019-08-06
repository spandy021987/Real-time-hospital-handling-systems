package Exceptions;
class Person
{
	void age() throws InvalidAgeException

{
	int age=60;
	if(age>=60)
	{
		System.out.println("Senior citizen");
	}
	else
	{
		throw new InvalidAgeException("Not a senior citizen");
		
		}
	}}
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
public class Person1 {
	public static void main(String[] args)
	{
		Person p1= new Person();
		try
		{
			p1.age();
		}
		catch(InvalidAgeException i1)
		{
			System.out.println(i1.getMessage());
		}
	}
}


