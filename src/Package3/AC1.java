package Package3;
interface AC
{
	void cool();
	void heat();
}
class Samsung implements AC
{
	public void cool()
	{
		System.out.println("Cooling");
	}
	public void heat()
	{
		System.out.println("Heating");
	}
}

public class AC1 {
	public static void main(String[] args)
	{
		Samsung s1= new Samsung();
		s1.cool();
		s1.heat();
		AC a1= new Samsung();
		a1.cool();
		a1.heat();
	}

}
