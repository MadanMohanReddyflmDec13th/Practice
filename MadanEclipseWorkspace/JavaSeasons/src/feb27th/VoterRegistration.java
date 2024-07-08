package feb27th;

import java.util.Scanner;

public class VoterRegistration {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Voting System...");
		System.out.println("Register your voter id ...");
		System.out.println("Enter below details \n Please Enter your age");
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		
		if (age>=18)
		{
			System.out.println("Please proceed with Voter ID Registration");
		}
		else
		{
			try
			{
				throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		System.out.println("End of Registration...");

	}

}
