package stringprograms;

import java.util.HashMap;

public class OccuranceofeachCharacterinaString {

	public static void main(String[] args) {
		
		String s="aabbccc";
		
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();

		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(map.containsKey(ch))
			{
				int count=map.get(ch);
				count++;
				
				map.replace(ch, count);
			}
			else
			{
				map.put(ch,1);
			}
		}
		
		System.out.println(map);
	}

}
