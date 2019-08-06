package Exceptions;
class incomeTax
{
	void pay() throws InvalidTaxException
	{
		double  ann_salary=400000.00;
		if(ann_salary>=500000.00)
		{
			System.out.println("Pay tax");
			
		}
		else
		{
		throw new InvalidTaxException("No tax");	
		}
		
	}
}
class InvalidTaxException extends Exception
{
	String msg;
	InvalidTaxException(String msg)
	{
		this.msg=msg;
	}

	public String getMessage()
	{
		return msg;
	}}
public class incomeTax1
{
	public static void main(String[] args)
	{
		incomeTax i1=new incomeTax();
		try
		{
			i1.pay();
		}
		catch(InvalidTaxException i)
		{
			System.out.println(i.getMessage());	
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	