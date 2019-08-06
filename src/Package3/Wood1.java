package Package3;
interface Wood
{
	void furniture();
}
class Teakwood implements Wood
{
	public void furniture()
	{
		System.out.println("Teakwood can be used to make furniture");
	}
}
class Rosewood implements Wood
{
	public void furniture()
	{
		System.out.println("Rosewood");
	}
}
public class Wood1 {
	public static void main(String[] args)
	{
		Teakwood t1= new Teakwood();
		t1.furniture();
		Rosewood r1= new Rosewood();
		r1.furniture();
		
	}

}
