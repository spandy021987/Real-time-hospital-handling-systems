package Package2;
abstract class TV
{
	abstract void watching();
	abstract void download();
}
class Sony extends TV
{
	void watching()
	{
		System.out.println("Tv's can be used to watch serials,news,movies,etc");
		
	}
	void download()
	{
		System.out.println("With the help of TV,we can also download video games");
		
	}
}
class Sony5V extends Sony
{
	void watching()
	{
		System.out.println("Sony is one brand in TV");
		
	}
	void download()
	{
		System.out.println("Tennis");
		
	}
}
class LGton extends TV
{
	void watching()
	{
		System.out.println("LG is used to watch news");
		
	}
	void download()
	{
		System.out.println("Golf");
		
	}
}
class hollywood
{
	static void see(TV t1)
	{
		t1.watching();
		t1.download();
	}
}
public class TV1 {
	public static void main(String[] args)
	{
		Sony5V s1=new Sony5V();
		hollywood.see(s1);
		LGton l1= new LGton();
		hollywood.see(l1);
		
	}

}
