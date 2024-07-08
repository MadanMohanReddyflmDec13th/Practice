package apr3rd;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String s1="Hello";//stored in SCPA
		System.out.println(s1);
		
		char[] ch= {'W','o','r','l','d'};//stored in heap area
		String s2=new String(ch);
		System.out.println(s2);
		
		System.out.println(s1+s2);
		

		String s3=new String("Hello");
		System.out.println(s1==s3);//here comparison done on reference
		
		System.out.println(s1.equals(s3));//here comparison done on content
		
		

	}

}
