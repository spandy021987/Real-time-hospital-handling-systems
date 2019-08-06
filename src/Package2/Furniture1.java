package Package2;
abstract class Furniture
{
	abstract void comfort();
	abstract void relax();
}
class chair extends Furniture
{
	void comfort()
	{
		System.out.println("Chairs are used for relaxation and to get great pleasure");
	}
void relax()
{
	System.out.println("Relaxation");
}
}
class Table extends Furniture
{
	void comfort()
	{
		System.out.println("People can enjoy in their furniture");
	}
	void relax()
	{
		System.out.println("Tables can be used to keep things");
	}
}
class Nataraj extends Table
{
	void comfort()
	{
		System.out.println("Nataraj is one brand in tables");
	}
	void relax()
	{
		System.out.println("Nataraj is best brand in India");
	}
}
class sit
{
	static void chairs(Furniture f1)
	{
		f1.comfort();
		f1.relax();
	}
}
public class Furniture1 {
	public static void main(String[] args)
	{
		Nataraj n1=new Nataraj();
		sit.chairs(n1);
		chair c1=new chair();
		sit.chairs(c1);
		
	}

}
