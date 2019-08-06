package Collections;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args)
	{
		//Set <Integer>s1=new HashSet<Integer>();
		//Set <Integer>s1=new LinkedHashSet<Integer>();
		TreeSet<Integer>s1= new  TreeSet<Integer>();
		s1.add(10000);
		s1.add(6);
		s1.add(6);
		s1.add(678);
		s1.add(754);
		int count= s1.size();
		System.out.println("Total no of elements ="+count);
		for(Integer s2:s1)
		{
			System.out.println(s2);
		}
	}

}
