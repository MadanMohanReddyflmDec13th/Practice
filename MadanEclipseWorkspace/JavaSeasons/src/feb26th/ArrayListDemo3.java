package feb26th;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("java");
		al.add("python");
		al.add("selenium");
		//al.add(200);
		
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		for (String tempvar:al)
		{
			System.out.println(tempvar);
		}
	}

}
