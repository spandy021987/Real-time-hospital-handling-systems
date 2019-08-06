package Package1;
class Pen
{
	void write()
	{
		System.out.println("Pens are used for writing");
			}
}
class Parker extends Pen

{
	void write()
	{
		System.out.println("Parker pens are one of the different types of pens");	
	}
}
class Reynolds extends Pen
{
	void write()
	{
		System.out.println("Reynolds is a most famous brand in pens and it is used by many people to write");
		
	}
}
class draw
{
	static void underline(Pen P)
	{
		P.write();
		
	}
}

public class Pen1 {
	
		public static void main (String[] args)
		
		{
		Parker P1 = new Parker();
		Reynolds R1 = new Reynolds();
		draw.underline(P1);
		draw.underline(R1);
			
			
			
		}
	

}
