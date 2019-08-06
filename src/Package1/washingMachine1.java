package Package1;
class washingMachine
{
	void wash()
	{
		System.out.println("Washing machine is used to wash the clothes,bedsheets,etc");
		}
}
class LG extends washingMachine
{
	void wash()
	{
		System.out.println("LG is a barnd washing machine and it is expensive");
	}
}
class Samsung extends washingMachine
{
	void wash()
	{
		System.out.println("Samsung is another brand of washing machine and it is manufactured by Samsung comapny");
		
	}
}
class clean
{
	static void vanish(washingMachine wm)
	{
		wm.wash();
	}
}
public class washingMachine1 {
	public static void main(String args)
	{
		LG l1=new LG();
		Samsung s1= new Samsung();
		clean.vanish(l1);
		clean.vanish(s1);
	}

}
