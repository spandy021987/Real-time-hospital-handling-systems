package Exceptions;
class ATM
{
	void withdrawal()  throws InvalidAmountException
	{
		int balance=500;
		if(balance>=1000)
		{
			System.out.println("Withdrawal is successful");
		}
		else {
			throw new InvalidAmountException ("Insufficient balance");
		}
	}
}
class InvalidAmountException extends Exception
{
	String msg;
	InvalidAmountException(String msg)
			{
		this.msg=msg;
		
			}
	public String getMessage()
	{
		return msg;
	}
}
public class mainClass1 {
	public static void main(String[] args)
	{
		ATM a1=new ATM();
		try
		{
			a1.withdrawal();
		}
		catch(InvalidAmountException i)
		{
			System.out.println(i.getMessage());
		}
	}
	

}
