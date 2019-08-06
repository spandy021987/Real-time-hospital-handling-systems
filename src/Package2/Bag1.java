package Package2;
abstract class Bag
{
	abstract void fashion();
	abstract void carry();
}
class Coach extends Bag
{
	void fashion()
	{
		System.out.println("Bags are used for fashion");
		
	}
	void carry() {
		System.out.println("Bags are used to carry everything");
		
		
	}
}
class Coachbrand extends Coach
{
	void fashion()
	{
		System.out.println("Bags are made up of different qualities like leather,cloth,etc");
		
	}
	void carry() {
		System.out.println("Bags are used to carry mobiles,money,cards,etc");
		
		
	}
}
class Macy extends Bag
{
	void fashion()
	{
		System.out.println("Leather");
		
	}
	void carry() {
		System.out.println("Books");
		
		
	}
}
class Expensive
{
	static void luxury(Bag b)
{
		b.fashion();
		b.carry();


}
}
public class Bag1 {
public static void main(String[] args)
{
	Coachbrand cb1=new Coachbrand();
	Expensive.luxury(cb1);
	Macy m1= new Macy();
	Expensive.luxury(m1);
}
}
