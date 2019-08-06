package Package3;
interface Car
{
	void run();
	void miles();
}
class Maruti implements Car
{
	public void run()
	{
		System.out.println("Run a car");
	}
	public void miles()
	{
		System.out.println("Car can run fotr several miles");
	}
	
}
public class Car1 {
	public static void main(String[] args)
	{
		Maruti m1= new Maruti();
		m1.run();
		m1.miles();
		Car c1= new Maruti();
		c1.run();
		c1.miles();
	}

}
