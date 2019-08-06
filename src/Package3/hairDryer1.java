package Package3;
interface hairDryer
{
	void dry();
	
}
class Revlon implements hairDryer
{
	public void dry()
	{
		System.out.println("Revlon is one brand in hairdryer that is used to dry our hair");
	}
}
class Latex implements hairDryer
{
	public void dry()
	{
		System.out.println("Latex is used to dry  our hair after washing our hairs.");
		
	}
}
public class hairDryer1 {
	public static void main(String[] args)
	{
		Revlon r1= new Revlon();
		r1.dry();
		Latex l1= new Latex();
		l1.dry();
	}

}
