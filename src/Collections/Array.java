package Collections;
import java.util.LinkedList;
import java.util.ArrayList;

public class Array{
	public static void main(String[] args)
	{
		//LinkedList l1= new LinkedList();
		ArrayList l1= new ArrayList();
		l1.add(10);
		l1.add(4.5);
		l1.add("Hi");
		l1.add(true);
		l1.add(null);
		int count1=l1.size();
		System.out.println("Total number of elements= "+count1);
		for(int i=0;i<l1.size();i++)
		{
			Object data = l1.get(i);
			System.out.println(data);
			
		}
			
	l1.remove("Hi");
	int count2=l1.size();
	System.out.println("Total no of elements= "+count2);
	for(int i=0;i<l1.size();i++)
	{Object data=l1.get(i);
	System.out.println(data);
	}
		
		
	}

}
