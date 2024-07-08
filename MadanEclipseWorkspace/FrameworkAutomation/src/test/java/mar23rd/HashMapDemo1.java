package mar23rd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
	Map<String,Integer> hMap=new HashMap<String,Integer>();
	
	hMap.put("Ram",101);
	hMap.put("Sam",102);
	hMap.put("Ravi",103);
	hMap.put("Gopi",104);
	
	//System.out.println(hMap.get("Ram"));
	//System.out.println(hMap.keySet());
	//System.out.println(hMap.values());
	
	Set<Entry<String, Integer>> entries=hMap.entrySet();
	
	//for each loop for iterating through each set
	for(Entry<String,Integer> tempvar:entries)
	{
		System.out.println(tempvar.getKey()+"..."+tempvar.getValue());
	}
	
	//By using Iterator
	Iterator<Entry<String, Integer>> itr =entries.iterator();
	Entry<String, Integer> entry=null;
	while(itr.hasNext())
	{
		entry=itr.next();
		System.out.println(entry.getKey()+"....."+entry.getValue());
	}

}
}
