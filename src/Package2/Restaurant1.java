package Package2;


abstract class Restaurant1 {
	abstract void cruise();
	abstract  void menu();

}
class Leela  extends Restaurant1
{
	void cruise()
	{
		System.out.println("REstaurants have their dineer in expensive cruises");
	}
	void menu()
	{
		System.out.println("Leela hotels have very good international brand food menu");
	}
	
	public static void main(String[] args)
	{
		Leela l1= new Leela();
		l1.cruise();
		l1.menu();
		Restaurant1 r1 = new Leela();
		r1.cruise();
		r1.menu();
		
	}
}
