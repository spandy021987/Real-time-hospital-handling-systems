package Package1;
class Cabs{
	
void destination()
{
	System.out.println("Cabs are used to drop preople from one location to another location");
}}
class Ola extends Cabs
{
	
	void destination()
	{
		System.out.println("Ola cabs are used for delivering people from one location to another location");	
	
	}}
class Uber extends Cabs
{
	void destination()
	{
		System.out.println("Uber is used for transporting people from one place to another");
	}
}

class Transportation
{
	static void travel(Cabs C)
	{
		C.destination();
	}
}


public class Cabs1 {
	public static void main(String[] args)
	{
		Ola o1= new Ola();
		Uber u1=new Uber();
		o1.destination();
		u1.destination();
		
	}

}
