package package4;

public class Car {
	String brand_name;
	double price;
	String colour;
	Car(String brand_name,double price,String colour)
	{
		this.brand_name=brand_name;
		this.price=price;
		this.colour=colour;
	}
	public String toString()
	{
		return "[brand_name = "+brand_name+" price = "+price+"  colour="+colour+"]";
	}
	public static void main(String[] args)
	{
		Car c1= new Car("Hyundai",70000.00,"Red");
		System.out.println(c1.toString());
		Car c2= new Car("Porsche",10000000.00,"Yellow");
		System.out.println(c2);
		
	}

}
