package jan31st;

import java.util.Scanner;

public class MethodsDemo3 {

	public static void main(String[] args) {
	//Sum of n natural numbers with return type int and taking input from console
		
		System.out.println("Enter value of x: ");
		
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
		MethodsDemo3 obj1=new MethodsDemo3();
		System.out.println(obj1.sumOfnNaturalNumbers(x));
		
		System.out.println("End of program");
	
	}
	//non-static method
	public int sumOfnNaturalNumbers(int n) {
		
		int res=n*(n+1)/2;
		return res;
	}
}
