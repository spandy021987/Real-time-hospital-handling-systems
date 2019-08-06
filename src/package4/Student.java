package package4;

public class Student {
	String name;
	int age;
	String branch;
	Student(String name,int age,String branch)
	{
	this.name=name;
	this.age=age;
	this.branch=branch;
	}
public String toString()
{
	return "[Name= "+name+" Age = "+age+" branch= "+branch+"]";
	
}
public static void main(String[] args)
{
	Student s1= new Student("Tejas",19,"CS");
	System.out.println(s1.toString());
	Student s2 = new Student("Spandana",31,"IS");
	System.out.println(s2);		
}
}
