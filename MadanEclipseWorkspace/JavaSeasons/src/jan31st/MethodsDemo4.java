package jan31st;

import java.util.Scanner;

public class MethodsDemo4 {

	public static void main(String[] args) {
		
		System.out.println("Enter value of x: ");
		
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
		//we can call method directly without creating object5
		
		System.out.println(MethodsDemo4.sumOfnNaturalNumbers(x));
		
		System.out.println("End of program");
		
	}
	//static method
	public static int sumOfnNaturalNumbers(int n) {
		
		int res=n*(n+1)/2;
		return res;
	}
}
