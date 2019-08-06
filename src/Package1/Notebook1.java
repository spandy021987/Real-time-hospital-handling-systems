package Package1;
class Notebook
{
	void use()
	{
		System.out.println("We can make notes,question papers,some important points,etc");
		
	}
	}
class Kitabh extends Notebook
{
	void use()
	{
		System.out.println("Kitabh is a company which sells notebooks,magazines,journals,etc");
		
	}
}

class Arun extends Notebook
{
	void use ()
	{
		System.out.println("Arun sells ruled notebooks and unruled notebooks");
		
	}
}
class read
{
	static void notes(Notebook n)
	{
		n.use();
	}
}
public class Notebook1 {
	public static void main(String[] args)
	{
	Arun a1= new Arun();
	Kitabh k1= new Kitabh();
	read.notes(a1);
	read.notes(k1);
	
	}

}
