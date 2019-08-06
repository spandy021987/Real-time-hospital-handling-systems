package Exceptions;
class Flat
{
	void cost() throws InvalidPriceException

{
	double price= 2000000.00;
	if(price>=4000000.00) {
		System.out.println("Purchase a flat");
	}
	else
	{
		throw new InvalidPriceException("Not affordable to purchase a flat");
	}
}}
	class InvalidPriceException extends Exception
	{
		String msg;
		InvalidPriceException(String msg)
		{
			this.msg=msg;
		}
		public String getMessage()
		{
			return msg;
		}
	
	}
public class Flat1 {
	public static void main(String[] args)
	{
		Flat f1=new Flat();
		try
		{
			f1.cost();
		}
		catch(InvalidPriceException i)
		{
			System.out.println(i.getMessage());
		}
	}

}

