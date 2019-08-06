package Package1;
class Mixer
{
	void blend()
	{
		System.out.println("Mixer is used to blend all the ingredients like making ragi powder,sambhar,etc");
	}
}
class Butterfly extends Mixer
{
	void blend()
	{
		System.out.println("Butterfly is one brand of a mixer");
			}
}
class Preeti extends Mixer
{
	void blend()
	{
		System.out.println("Preeti is another brand in mixers");
			}
}
class juice
{
	static void jar (Mixer M)
	{
		M. blend();
			}
}

public class Mixer1 {
	public static void main(String[] args)
	{
Butterfly b1=new Butterfly();
Preeti p1= new Preeti();
p1.blend();
juice.jar(b1);
juice.jar(p1);
}}


