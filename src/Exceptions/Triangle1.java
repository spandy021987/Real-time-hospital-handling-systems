package Exceptions;

class Triangle {
	void sides() 	throws InvalidShapeException
	{
		int sides=3;
		
	
if(sides==6)
{
	System.out.println("It is a triangle");
}
else 
{
	throw new InvalidShapeException ("Not a triangle"); 
}
}
}
class InvalidShapeException extends Exception
{
	String msg;
	InvalidShapeException(String msg)
	{
	this.msg=msg;	
	}
	public String getMessage()
	{
		return msg;
	}}
	public class Triangle1
	{
		public static void main(String[] args)
		{
			Triangle t1= new Triangle();
			try
			{
				t1.sides();
			}
			catch(InvalidShapeException i1)
			{
				System.out.println(i1.getMessage());
				
			}
		}
	}


