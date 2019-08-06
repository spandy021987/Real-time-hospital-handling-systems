package package4;

public class Apartments {
	String name;
	double price;
	String builders;
	Apartments(String name,double price,String builders)
	{
		this.name=name;
		this.price=price;
		this.builders=builders;
	}


public String toString()
{
	return "[name = "+name+" price = "+price+"  builders = "+builders+"]";
}
public static void main(String[] args)
{
	Apartments a1= new Apartments("Sobha",9000000.00,"Sobha");
	System.out.println(a1.toString());
	Apartments a2=new Apartments("Pashmina",10000000.00,"Pashmina_builders");
	System.out.println(a2);
}
}