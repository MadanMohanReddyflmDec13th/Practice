package jan30th;

public class MethodsDemo2 {

	public static void main(String[] args) {
		
		//Creation of object
		//ClassName objectName=new ClassName();
		MethodsDemo2 obj1=new MethodsDemo2(); 
		
		obj1.sumOfnNaturalNumbers(5);
		obj1.sumOfnNaturalNumbers(10);
		obj1.sumOfnNaturalNumbers(100);
		obj1.sumOfnNaturalNumbers(1000);
		
		
	}
		
	//non-static method
	public void sumOfnNaturalNumbers(int n) {
		
		int res=n*(n+1)/2;
		System.out.println("Sum of "+n+"natural numbers is "+res);
	}
}

