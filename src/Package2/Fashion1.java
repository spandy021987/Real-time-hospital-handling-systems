package Package2;
abstract class Fashion
{
	abstract void dress();
	abstract void accessories();
}
class Myntra extends Fashion
{
	void dress()
	{
		System.out.println("Myntra is an online shopping centre ");
	}
	void accessories()
	{
		System.out.println("We can also purchase accessories in Myntra");
	}
}

class Jcpenney extends Fashion
{
	void dress()
	{
		System.out.println("Jcpenney is a shopping centre ");
	}
	void accessories()
	{
		System.out.println("Accessories are also available in Jcpenney ");
	}
}

public class Fashion1 {
	public static void main(String[] args)
	{
		Myntra m1= new Myntra();
		m1.dress();
		m1.accessories();
		Jcpenney j1= new Jcpenney();
		j1.dress();
		j1.accessories();
	}
	

}
