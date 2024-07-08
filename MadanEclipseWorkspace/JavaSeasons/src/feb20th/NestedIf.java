package feb20th;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		System.out.println("enter your department: ");
		Scanner input1=new Scanner(System.in);
		String dept=input1.next();

		
		System.out.println("enter your salary: ");
		Scanner input2=new Scanner(System.in);
		double sal=input2.nextDouble();
		
		if(dept.equalsIgnoreCase("it"))
		{
			if(sal<=20000)
			{
				sal=sal+sal*(0.2);
			}
			else if(sal>20000 && sal<=50000)
			{
				sal=sal+sal*(0.3);
			}
			else if(sal>50000)
			{
				sal=sal+sal*(0.4);
			}
			
		}
		else if (dept.equalsIgnoreCase("non-it"))
		{
			if(sal<=20000)
			{
				sal=sal+sal*(0.1);
			}
			else if(sal>20000 && sal<=50000)
			{
			sal=sal+sal*(0.2);
			}
			else if(sal>50000)
			{
				sal=sal+sal*(0.3);
			}	
			
			
		}
		
		System.out.println("New salary: "+sal);
		
	}

}
