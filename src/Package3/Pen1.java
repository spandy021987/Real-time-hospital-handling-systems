package Package3;
interface Pen
{void write();
}
class Reynolds implements Pen
{
	public void write()
	{
	System.out.println("Can be used for writing");
}
}
class Cellogripper implements Pen
{
	public void write()
	{
	System.out.println("Used in exams");
}
}
class gello extends Cellogripper
{
	public void write()
	{
	System.out.println("Can be used for writing in offices");
}
}
public class Pen1 {
	public static void main(String[] args)
	{
		Pen p1= new Reynolds();
				p1.write();
		Cellogripper  c1= new Cellogripper();
		c1.write();
		gello g1= new gello();
		g1.write();
		
	}

}

