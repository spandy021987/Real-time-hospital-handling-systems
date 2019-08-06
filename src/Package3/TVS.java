package Package3;
interface Scooter
{
	void drive();
	void distance();
	}
interface Honda extends Scooter
{
	void price();
}
class TVS implements Honda
{
	public void drive()
	{
		System.out.println("Scooters can be used for driving");
	}
	public void distance()
	{
		System.out.println("Scooters can be used to drive for short distances");
	}
	public void price()
	{
		System.out.println("Scooter can be expensive or cheap");
	}


public static void main(String[] args)
{
	TVS t1= new TVS();
	t1.drive();
	t1.distance();
	t1.price();
	
}
}
