package Package1;
class orderFood
{
	void delivery()
	{
		System.out.println("Foods can be delivered to a customer");
	}
}
class Zomato extends orderFood
{
	void delivery()
	{
		System.out.println("Zomato is an application that is used to deliver food to its customer");
		
	}
}
class Swiggy extends orderFood
{
	void delivery()
	{
		System.out.println("Swiggy is another type of application that ios used to deliver food to its customers");
	}
}
class Vendor
{
	static void duty(orderFood of)
	{
	of.delivery();	
	}
}
public class orderFood1 {
	public static void main(String[] args)
	{
	Zomato z1 = new Zomato();
	Swiggy s1= new Swiggy();
	Vendor.duty(z1);
	Vendor.duty(s1);
		
	}

}
