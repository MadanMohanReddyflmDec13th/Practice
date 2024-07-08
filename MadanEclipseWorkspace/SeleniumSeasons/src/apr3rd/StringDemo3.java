package apr3rd;

import java.util.Scanner;

public class StringDemo3 {

	public static void main(String[] args) {
	
		System.out.println("Enter a string...");
		Scanner input=new Scanner(System.in);
		//String s1=input.next();
		String s1=input.nextLine();
		System.out.println(s1);
		
		toFindOccuranceofEachCharacterInaString(s1);
		
		
	}

	private static void toFindOccuranceofEachCharacterInaString(String s1) {
		
		int[] ch=new int[256];
		for (int i=0;i<s1.length();i++)
		{
			ch[s1.charAt(i)]++;
		}
		
		for (int i=0;i<256;i++)
		{
			if(ch[i]>0)
			{
				System.out.println((char)i+" occured "+ch[i]+" times ");
			}
			
		}
		
	}
	
	

}
