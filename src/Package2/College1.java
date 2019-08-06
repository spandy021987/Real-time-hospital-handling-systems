package Package2;
abstract class College
{
	abstract void education();
	abstract void qualify();
}
class Reva extends College
{
	void education()
	{
		System.out.println("Students will go to colleges to get better education");
	}
	void qualify()
	{
		System.out.println("Students will get qualification ");
	}
}
class Maharani extends College
{
	void education()
	{
		System.out.println("Students can take respective subjects and learn in depth");
	}
	void qualify()
	{
		System.out.println("Graduation certificate ");
	}
}
class knowledge
{static void get(College c)
	{c.education();
	c.qualify();
	
	}
}
public class College1 {
	public static void main(String[] args)
	{
	Reva r1= new Reva();
	knowledge.get(r1);
	Maharani m1= new Maharani();
	knowledge .get(m1);
	}

}
