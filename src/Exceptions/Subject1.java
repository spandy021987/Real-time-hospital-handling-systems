package Exceptions;
class Subject
{
	void distinction() throws InvalidMarkException
	{
		double marks=55.00;
		if(marks>=85)
		{
			System.out.println("Distinction");
		}
			else
			{
				throw new InvalidMarkException("Not a distiction");
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
	

public class Subject1 {
	public static void main(String[] args)
	{
		Subject s1= new Subject();
		try
		{
			s1.distinction();
		}
		catch(InvalidMarkException i1)
		{
			System.out.println(i1.getMessage());
			
		}
	}
}


