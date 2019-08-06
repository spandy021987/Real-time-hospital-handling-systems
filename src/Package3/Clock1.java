package Package3;
interface Clock
{
	void time();
	void count();
}
interface Ajanta extends Clock
{
	void see();
}
class Clock1  implements Ajanta {
	 public void time()
	 {
		 System.out.println("Clocks can be used to watch time");
	 }
public void count()
{
System.out.println("Depending on the number of hours,we calculate the number of days");
}
public void see()
{
	System.out.println("Time is an essential asset in every person's life");
}
public static void main(String[] args)
{
	Clock1 c1= new Clock1();
	c1.time();
	c1.count();
	c1.see();
}}
