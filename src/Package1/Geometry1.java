package Package1;
class Geometry
{
	void shape()
	{
	System.out.println("In geometry,there are many shapes and figures");	 
	}
}
class Triangle extends Geometry
{ void shape()
	{
	System.out.println("Triangle has three sides.");
}
}
class Rectangle extends Geometry
{
	void shape()
	{
		System.out.println("Rectangle has four sides.");
	}
}
class maths
{
	static void shapes(Geometry g)
	{
		g.shape();
	}
}
public class Geometry1 {
	public static void main(String[] args)
	{
		Triangle t1=new Triangle();
		Rectangle r1=new Rectangle();
		maths.shapes(t1);
		maths.shapes(r1);
	}

}
