package Package3;
interface TV
{
	void watch();
	void play();
	
	
}
class Sony implements  TV
{
	public void watch()
	{
		System.out.println("TV's are used to watch movies,news,entertainment,etc");
	}
	public void play()
	{
		System.out.println("TV'S are used to play video games");
	}
}

public class TV1 {
	public static void main(String[] args)
	{
		Sony s1= new Sony();
		s1.watch();
		s1.play();
		TV t1= new Sony();
		t1.watch();
		t1.play();
	}
	

}
