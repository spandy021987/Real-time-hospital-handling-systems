package Collections;
import java.util.TreeMap;

public class Map {
	public static void main(String[] args)
	{
		//Map m1= new LinkedHashMap();
		//Map m1= new HashMap();
		TreeMap<String,Integer>m1= new TreeMap <String,Integer>();
		m1.put("Benz", 10);
		m1.put("Audi", 5);
		m1.put("Jaguar", 10);
		m1.put("Audi", 25);
		m1.put("Benz", 26);
		System.out.println(m1);
		
		
	}

}
