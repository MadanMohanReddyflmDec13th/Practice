package jan30th;

import java.util.Scanner;

public class OperatorsDemo6 {

	public static void main(String[] args) {

		// Ternary Operator

		System.out.println("Enter some value for x: ");

		Scanner input = new Scanner(System.in);
		int x = input.nextInt();

		/*
		 * if (x >= 0) { System.out.println("+ve"); } else { System.out.println("-ve");
		 * }
		 */
		
		//String output= (x>0)?"+ve":"-ve";
		//System.out.println(output);
		System.out.println((x>0)?"positive":"Negative");
		
		
		//Concatenate Operator
		
		System.out.println("Rama"+"Rao");
		System.out.println("Apple"+123);
		String a="Rama"+123;
		System.out.println(a);
		
		String z= "987"+"123";
		System.out.println(z);
		
	}

}
