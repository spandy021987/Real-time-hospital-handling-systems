package Package3;
interface Furniture
{
	void chair();
	void table();
}
interface Luna extends Furniture
{
	void things();
}
 class Furniture1 implements Furniture
{
	public void chair()
	{
		System.out.println("People can sit on the chair in their homes");
	}
	public void table()
	{
		System.out.println("People can keep things on the top of the table");
			}
public void things()
{
		System.out.println("Very useful things like books,papers,documents can be kept on the top of it");
}



	public static void main(String[] args)
	{
		Furniture1 f1 = new Furniture1();
		f1.chair();
		f1.table();
		f1.things();
	}

}
