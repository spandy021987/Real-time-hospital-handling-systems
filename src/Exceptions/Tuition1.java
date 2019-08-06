package Exceptions;
class Tuition
{
	void fees() throws InvalidFeesException
	{
		double fees=30000.00;
		if(fees>=30000)
		{
			System.out.println("Affordable fees charged by an instituition");
	   }
		else
		{
			throw new InvalidFeesException("Not affordable");
		}
	}
}
class InvalidFeesException extends Exception
{
	String msg;
	InvalidFeesException(String msg)
	{
		this.msg=msg;
	}

public String getMessage()
{
	return msg;
}}
public class Tuition1 {
	public static void main(String[] args)
	{
		Tuition t1=new Tuition();
		try
		{
			t1.fees();
		}
		catch(InvalidFeesException i1)
		{
			System.out.println(i1.getMessage());
		}
				
		
	}

}
