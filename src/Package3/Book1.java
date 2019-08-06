package Package3;
interface Book
{
	void write();
}
class Ruled implements Book
{
	public void write()
	{
		System.out.println("Some important notes can be written");
	}
}
class drawing implements Book
{
	public void write()
	{
		System.out.println("Pencil sketches or Paintings");
	}
}

public class Book1 {
	public static void main(String[] args)
	{
		Ruled r1= new Ruled();
		r1.write();
		drawing d1= new drawing();
		d1.write();
	}

}
