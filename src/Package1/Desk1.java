package Package1;
class Desk
{
	void keep()
	{
		System.out.println("Desks are used to keep some things like books,pens,detergents,etc");
	}
}

class Amtra extends Desk
{
	void keep()
	{
		System.out.println("Amtra is a brand company in desks and it is used by many organizations");
	}
}
class Nataraj extends Desk
{
	void keep()
	{
		System.out.println("Nataraj is another brand company in desks and it is used by many people");
		
	}
}
class Laptop
{
	static void official(Desk d)
	{
	d.keep();
	}
}
public class Desk1 {
	public static void main(String[] args)
	{
	Amtra a1 = new Amtra();
	Nataraj n1= new Nataraj();
	Laptop.official(a1);
	Laptop.official(n1);
	
	}
	

}
