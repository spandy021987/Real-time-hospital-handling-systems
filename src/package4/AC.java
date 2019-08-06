package package4;

public class AC {
	String brand_name;
	double price;
	String colour;
	AC(String brand_name,double price,String colour)
	{
		this.brand_name=brand_name;
		this.price=price;
		this.colour=colour;
	}
public String toString()
{
	return "[brand_name= "+brand_name+" price= "+price+"   colour = "+colour+"]" ;
}
	public static void main(String[] args)
	{
		AC a1= new AC("LG",80000.00,"Black");
		System.out.println(a1.toString());
		AC a2= new AC("Samsung",90000.00,"White");
		System.out.println(a2);
		
	}
	
	
	
	
	
}
	
	
	
	
	
	

