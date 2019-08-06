package Package1;

 class Ov1 {
	void heating()
	{
		System.out.println("Oven is used for heating");
	}
	void bake()
	{
		System.out.println("Oven is used to bake cakes");
	}
}
class Rem extends Ov1
{
	void heating()
	{
	System.out.println("Xstar is one brand in oven");
	}
	void bake()
	{
		System.out.println("pizza");
	}
	}
class Bluestar extends Ov1
{void heating()
	{
	System.out.println("Bluestar is another product");

}
void bake()
{System.out.println("Cakes");
		
}
}
class one
{
	static void boil(Ov1 o1)
	{
		o1.heating();
		o1.bake();
	}
}
public class Oven1
{
	public static void main(String[] args)
	{
	Rem r1=new Rem();
		one.boil(r1);
		
		Bluestar b1= new Bluestar();
		one.boil(b1);
	}}

	
