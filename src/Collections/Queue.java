package Collections;

import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args)
	{
		PriorityQueue<Integer>p1=new PriorityQueue<Integer>();
		p1.add(99);
		p1.add(10);
		p1.add(99);
		p1.add(6);
		p1.add(57);
		
		int count=p1.size();
		System.out.println("Total number of elements= "+count);
		for(int i=0;i<p1.size();i++)
		{
			   Object data=p1.poll();
			System.out.println(data);
			
		}
	}

}
