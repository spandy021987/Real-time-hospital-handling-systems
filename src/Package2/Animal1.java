package Package2;

abstract class Animal
{
	abstract void sleeping();
	abstract void eating();

}
 class Dog extends Animal
{
	void sleeping()
	{
		System.out.println("Dog is sleeping whole day");
	}
	void eating()
	{
		System.out.println("Dog is always barking");	
	}
	} 
class  Cat extends Animal
{
	void sleeping()
	{
		System.out.println("Cat is sleeping");
		
	}
	void eating()
	{
		System.out.println("Cat is eating the whole day");
	}
}
class sound
{
	static void noise(Animal a)
	{a.sleeping();
	a.eating();
	}
}
public class Animal1 {
	public static void main(String[] args)
	{
	Dog d1=new Dog();
	sound.noise(d1);
	
	Cat c1= new Cat();
	sound.noise(c1);
	}

}
