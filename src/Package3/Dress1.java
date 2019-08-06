package Package3;
interface Dress
{
	void wear();
	void fashion();
}
class Tshirt implements Dress
{
	public void wear()
	{
		System.out.println("Tshirts are used to wear");	
	}
	public void fashion()
	{
		System.out.println("There are many categories in Tshirts");
	}
}

public class Dress1 {
	public static void main(String[] args)
	{
Tshirt t1=new Tshirt();
t1.wear();
t1.fashion();
Dress d1= new Tshirt();
d1.wear();
d1.fashion();
}
}