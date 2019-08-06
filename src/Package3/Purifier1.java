package Package3;
interface Purifier
{
	void drink();
	void process();
}

class LG implements Purifier
{
	public void drink()
	{
		System.out.println("Purifiers are used for drinking water");
	}
	public void process()
	{
		System.out.println("We can drink purified water");
	}
	
	}


public class Purifier1 {
	public static void main(String[] args)
	{
	LG l1= new LG();
	l1.drink();
	l1.process();
	Purifier p1=new LG();
	p1.drink();
	p1.process();
	
	
	}	

}
