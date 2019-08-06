package Collections;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Sort {
	public static void main(String[] args)
	{
		List<Integer> l1=new LinkedList<Integer>();
		l1.add(990);
		l1.add(1);
		l1.add(877);
		Collections.sort(l1);
		for(Object l2:l1)
		{
			System.out.println(l2);
		}
		
	}

}
