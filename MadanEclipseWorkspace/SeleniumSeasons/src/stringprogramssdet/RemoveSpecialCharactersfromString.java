package stringprogramssdet;

public class RemoveSpecialCharactersfromString {

	public static void main(String[] args) {
		
		String s="$abc@gmail.com#";
		String op="";
		
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>64 && s.charAt(i)<123)
			{
				op=op+s.charAt(i);
			}
		}
		
		System.out.println(op);
	}

}