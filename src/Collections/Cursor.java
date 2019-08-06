package Collections;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Cursor {
	public static void main(String[] args)
	{
		Set s1= new TreeSet();
		s1.add(88);
		s1.add(10);
		s1.add(10);
		s1.add(3);
		s1.add(76);
		Iterator itr=s1.Iterator();
		while(itr.hasNext()) {
			Object data=itr.next();
			System.out.println(data);
			
			LinkedList l1= new LinkedList();
			l1.add("Hi");
			l1.add("Spandana");
			l1.add("Shrinika");
			l1.add("Mahesh");
			l1.add("Suresh");
			
			System.out.println("Using for loop");
			for(int i=0;i<5;i++)
{
				System.out.println(l1.get(i));
}
			System.out.println("Using for each loop");
			for(Object l2:l1)
			{
				System.out.println(l2);
			}
			System.out.println("Using iterator");
			Iterator<E>  itr=l1.iterator();
			while(itr.hashNext())
			{
				System.out.println(itr.next());
			}
			System.out.println("Using list iterator");
			System.out.println("Navigating in forward direction");
			ListIterator Litr=l1.ListIterator();
			while(Litr.hasNext)
			{
				System.out.println("litr.Next()");
			}
			System.out.println("Navigating in reverse direction");
			ListIterator Litr=l1.ListIterator();
			while(Litr.hasPrevious)
			{
				System.out.println("litr.Previous()");
			}
			
				
			
			}
			
		}
		
		
		
	}

Q1
