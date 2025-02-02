package feb27th;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter Dividend: ");
		Scanner input1=new Scanner(System.in);
		int x=input1.nextInt();
		
		System.out.println("Enter Divisor: ");
		int y=input1.nextInt();
		
		/*
		try
		{
			//Risky Code
			System.out.println("Quotient is: "+(x/y));
		}
		catch(ArithmeticException e)
		{
			//User friendly code
			System.out.println("Please enter a non-zero value for y");
		}
		*/
		/*
		try
		{
			//Risky Code
			System.out.println("Quotient is: "+(x/y));
		}
		catch(ArithmeticException e)
		{
			//User friendly code
			System.out.println("Please enter a non-zero value for y");
		}
		finally
		{
			//Compulsory executable code
			System.out.println("Quotient is evaluated");
		}
		
		*/
		try
		{
			//Risky Code
			System.out.println("Quotient is: "+(x/y));
		}
		catch(ArithmeticException e)
		{
			//User friendly code
			System.out.println("Please enter a non-zero value for y");
		}
		catch(RuntimeException e)
		{
			System.out.println("Runtime Exception Occured");
		} 
		
		finally
		{
			//Compulsory executable code
			System.out.println("Quotient is evaluated");
		}
		
		
		System.out.println(".....End .....");
	}

}
