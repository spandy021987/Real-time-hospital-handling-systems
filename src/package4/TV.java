package package4;

public class TV {
	String brand_name;
	double price;
	String colour;
	TV(String brand_name,double price,String colour)
	{
		this.brand_name=brand_name;
		this.price=price;
		this.colour=colour;
			}
	public String toString()
	{
		return "[brand_name= "+brand_name+" price="+price+" colour="+colour+"]";
		
	}
	public static void main(String[] args)
	{
		TV t1= new TV("Samsung",80000.00,"Black");
		System.out.println(t1.toString());
		TV t2= new TV("Sony",60000.00,"Black");
		System.out.println(t2);
		
	}
}
