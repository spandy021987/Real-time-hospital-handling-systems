package Package2;

abstract class Dog {
	abstract void barking();
	abstract void sleeping();

}
 class Julie extends Dog
{
void barking()
{
	System.out.println("Dogs will be looking and barking at the stranger");
}
void sleeping() {
	System.out.println("Dogs will be sleeping the whole day");
	
}



public static void main(String[] args)
{
Julie j1= new Julie();
j1.barking();
j1.sleeping();
Dog d1= new Julie();
d1.barking();
d1.sleeping();
}
}