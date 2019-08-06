package Package2;
abstract class Fans
{
	abstract void cooling();
	abstract void rotate();
}
class Havellis extends Fans
{
	void cooling()
	{
		System.out.println("Fans are used for cooling");
	}
	void rotate()
	{
		System.out.println("When we switch on the fan,fans will start revolving its blades");
	}

}
class Havellis_5G extends Havellis
{
	void cooling()
	{
		System.out.println("Reducing the sweat");
	}
	void rotate()
	{
		System.out.println(" Blades");
	}

}
class Usha  extends Fans
{
	void cooling()
	{
		System.out.println("Fans are used for cooling");
	}
	void rotate()
	{
		System.out.println("Fans will start revolving its blades");
	}

}
class brand
{
	static void turn(Fans f1)
	{
		f1.cooling();
		f1.rotate();
	}
	}



	
public class Fans1 {
	public static void main(String[] args)
	{
		Havellis_5G h1= new   Havellis_5G();
		brand.turn(h1);
		Usha u1= new Usha();
		brand.turn(u1);
	}

}
