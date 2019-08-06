package Package2;

abstract class Desk {
	abstract void official();
	abstract void keep();

}
class Amtra extends Desk
{
	void official()
	{
		System.out.println("Desks can be used for office work like writing on it");
			}
	void keep()
	{
		System.out.println("Desks can also be used to keep some things like papers,books over it");
		
	}}
public class Desk1
{

	public static void main(String[] args)
	{
		Amtra a1= new Amtra();
		a1.official();
		a1.keep();
		Desk d1=new Amtra();
		d1.official();
		d1.keep();
		
	}
}
