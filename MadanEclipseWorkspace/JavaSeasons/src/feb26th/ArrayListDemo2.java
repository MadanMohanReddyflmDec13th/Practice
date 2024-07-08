package feb26th;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("FLM");
		al.add("13");
		al.add("3.14");
		al.add("Java");
		al.add(4, "Python");

		System.out.println(al);

		System.out.println(al.size());

		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}

		
		System.out.println("************************");

		al.add("FLM");
		al.add(10);
		al.add(3.14);
		al.add("Java");
		al.add("Python");
		al.add("FLM");
		al.add(10);
		al.add(3.14);
		al.add("Java");
		al.add("Python");

		System.out.println("New Size is " + al.size()); // 15

		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}

		System.out.println(al.contains("Python"));

	}

}
