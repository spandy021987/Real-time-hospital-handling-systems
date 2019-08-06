package Package2;
abstract class Fridge
{
	abstract void cooling();
	abstract void storing_food();
}
class  Bluestar extends Fridge
{
	void cooling()
	{
		System.out.println("Fridges are used for cooling ice creams,etc.");
	}
void storing_food()
{
	System.out.println("Fridges are mainly used to store some food in it.");
}
public static void main(String[] args)
 {
Bluestar b1= new Bluestar();
b1.cooling();
b1.storing_food();
}
}
