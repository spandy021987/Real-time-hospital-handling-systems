package Package2;
abstract class Apartment
{
abstract void live();
abstract void profit();
}
abstract class Pashmina extends Apartment
{
	void live()
	{
		System.out.println("Apartments are another category in homes to lead a simple living");
	}

}
class Pashmina_waterfront extends Pashmina
{
	void profit()
	{
		System.out.println("Apartments are basically investment for the people who invest in it");	
	}
}
class Apartment1
{
	public static void main(String[] args)
	{
		Pashmina_waterfront p1= new Pashmina_waterfront();
		p1.live();
		p1.profit();
	}
}