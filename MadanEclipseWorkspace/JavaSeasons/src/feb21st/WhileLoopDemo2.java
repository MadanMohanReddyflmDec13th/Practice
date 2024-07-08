package feb21st;

import java.util.Scanner;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Enter some character: ");
		Scanner input=new Scanner(System.in);
		char ch=input.next().charAt(0);
		
		if (ch!='x' && ch!='X')
		{
			System.out.println("You have entered a character: "+ch);
		}
		else
		{
			System.out.println("x entered...So leaving loop");
		}

	}

}
