package feb26th;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		hs.add("FLM");
		hs.add("Java");
		hs.add("Selenium");
		hs.add("Python");
		hs.add("TOSCA");
		
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		
		//Retriving elements Using for each loop
		for(String var:hs)
		{
			System.out.println(var);
		}
		
		System.out.println("********");
		
		//Retriving using iterator
		
		Iterator<String> itr=hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Adding duplicate element
		System.out.println(hs.add("Java"));  //it will get added to set,but it gives output as false
		
		//Getting hashcodes and positions deciding
		System.out.println("FLM".hashCode()%16);
		System.out.println("Java".hashCode()%16);
		System.out.println("Python".hashCode()%16);
		System.out.println("Selenium".hashCode()%16);
		System.out.println("TOSCA".hashCode()%16);

	}

}
