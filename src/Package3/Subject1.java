package Package3;
interface Subjects
{
	void study();
			
	}
class Science implements Subjects
{
	public void study()
	{
		System.out.println("Science is a subject which basically deals with living things,alkalines and physics");
	}
}
class Maths implements Subjects
{
	public void study()
	{
		System.out.println("Maths will be taught for school students,college students by their teachers");
	}
}
public class Subject1 {
public static void main(String[] args)
{
	Science s1= new Science();
	s1.study();
	Maths m1= new Maths();
	m1.study();
}
}
