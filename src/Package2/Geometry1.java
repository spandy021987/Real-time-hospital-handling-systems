package Package2;
abstract class Geometry
{
	abstract void shapes();
	abstract void area();
	
}
class Triangle extends Geometry
{
	void shapes()
	{
		System.out.println("Triangle has 3 sides");

	}
	void area()
	{
		System.out.println("Different geometrical figures have different araes ");	
	}
}
class Rectangle extends Geometry
{
	void shapes()
	{
		System.out.println("Rectangle has 4 sides");

	}
	void area()
	{
		System.out.println("Different geometrical figures have different areas ");	
	}
}

public class Geometry1 {
	public static void main(String[] agrs)
	{
	Triangle t1= new Triangle();
	t1.shapes();
	t1.area();
	Rectangle r1= new Rectangle();
	r1.shapes();
	r1.area();
	
	
	}
}
