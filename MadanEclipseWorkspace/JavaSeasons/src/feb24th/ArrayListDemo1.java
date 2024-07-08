package feb24th;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		List al=new ArrayList();
		
		System.out.println(al.size());
		
		al.add(10);
		al.add(30);
		al.add(40);
		
		System.out.println(al.size());
		
		al.add(1,20);
		
		System.out.println(al.size());
	}

}
