package Package2;

abstract  class Ac {
	abstract void cooling();
	abstract void heating();
}
class Samsung extends Ac
{
	void cooling()
	{
		System.out.println("AC's can be used for cooling");
	}
	void heating()
	{
		System.out.println("Ac's can be used for heating");
	}
}
	public class Ac1
	{
	public static void main(String[] args)
	{
		Samsung s1 = new Samsung();
		s1.cooling();
		s1.heating();
		
	}
}