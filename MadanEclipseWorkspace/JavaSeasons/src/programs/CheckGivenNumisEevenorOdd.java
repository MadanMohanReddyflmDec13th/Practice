package programs;

import java.util.Scanner;

public class CheckGivenNumisEevenorOdd {

	public static void main(String[] args) {
		
		//int num=8;
		System.out.println("Enter Num");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}
