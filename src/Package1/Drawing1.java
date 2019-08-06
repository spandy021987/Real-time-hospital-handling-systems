package Package1;
class Drawing
{
void sketch()
{
	System.out.println("Pencils or sketch pens can be used for drawing that illustrates about the imaginary life styles");
}
}
class Colour extends Drawing
{
	void sketch()
	{
		System.out.println("Paintings can be done with the help of sketch pens");	
	}
}
class Pencilsketch extends Drawing
{
	void sketch()
	{
		System.out.println("Paintings can also be pencil sketch");
		
	}
}
class art
{
	static void gallery(Drawing D)
	{
		D.sketch();
	}}


public class Drawing1 {
	public static void main(String[] args)
	{
		Colour c1= new Colour();
		Pencilsketch p1= new Pencilsketch();
		art.gallery(c1);
		art.gallery(p1);
	}}
		
		
		
	


