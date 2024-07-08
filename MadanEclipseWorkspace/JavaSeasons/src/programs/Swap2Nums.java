package programs;

public class Swap2Nums {
	
	
	public static void main(String[] args) {
		
		int a=10;
		int b=25;
		int temp;
		
		//using 3rd variable
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
		//without 3rd variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
