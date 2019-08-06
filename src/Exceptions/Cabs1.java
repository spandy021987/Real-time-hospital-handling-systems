package Exceptions;
class Cabs
{
	void ride()  throws InvalidCabException
	 {
		int cab=0;
		if(cab>=0)
		{
			System.out.println("Cabs are available" );
		}
		else
		{
			throw new InvalidCabException("Not available");
		}
	 }
}
class InvalidCabException extends Exception
{
String msg;
InvalidCabException(String msg)
{
	this.msg=msg;
}
public String getMessage()
{
	return msg;
}
}
public class Cabs1 {
	public static void main(String[] args)
	{
	Cabs c1= new Cabs();
	try
	{
		c1.ride();
		
	}
	catch(InvalidCabException i1)
	{
	System.out.println(i1.getMessage());
	}

}}
