package Package3;
interface Cars
{
	void distance();
	void transport();
	
}
interface Santro extends Cars
{
	 void mileage();
}
 class 	Santro2 implements Santro
{
	public void distance()
	{
		System.out.println("Cars can travel up tp many miles");
	}
	public void transport()
	{
		System.out.println("Cars can be used for transportation");
	}
	public void mileage()
	{
		System.out.println("Cas can be used for lon distances");
	}
}
public class Car2 {
	public static void main(String[] args)
	{
		Santro2 s2= new Santro2();
		s2.mileage();
		s2.transport();
	}

}
