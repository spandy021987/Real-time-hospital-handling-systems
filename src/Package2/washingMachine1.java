package Package2;
abstract class washingMachine
{
	abstract void washing();
	abstract void detergent();
}
class LG extends washingMachine
{
	void washing()
	{
		System.out.println("Washing machine is used to wash the clothes");
	}
	void detergent()
	{
		System.out.println("Detergent can be added to remove dirt from clothes");
	}
}
class LGton1 extends LG
{
	void washing()
	{
		System.out.println("Washing");
	}
	void detergent()
		{
			System.out.println("Removing dirt");
		}
	}
	class Videocon extends washingMachine
	{
		void  washing()
		{
			System.out.println("Washing the woolen clothes");
		}
		void detergent()
		{
			System.out.println("Surf excel mattic");
			
	}
}
	class clean
	{
		static void vanish(washingMachine wm)
		{
			wm.washing();
			wm.detergent();
		}}
	
		
	

public class washingMachine1 {
	public static void main(String[] args)
	{
	LGton1 l1=new LGton1();
	clean.vanish(l1);
	Videocon v1= new Videocon();
	clean.vanish(v1);
	}

}
