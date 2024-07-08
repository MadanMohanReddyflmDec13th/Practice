package stringprogramssdet;

public class ReverseAString {

	public static void main(String[] args) {
		
		//Approach 1
		String s="selenium";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reversed string is: "+rev);

		
		/* approach 2
		String s="selenium";
		String rev="";
		
		char[] a=s.toCharArray();
		
		for (int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reversed string is: "+rev);
		*/
		
		/* Approach 3
		StringBuffer s=new StringBuffer("selenium");
		System.out.println(s.reverse());
		*/
		
		/*Approach 4
		StringBuilder s=new StringBuilder("selenium");
		System.out.println(s.reverse());
		*/	
		}

}
