package feb8th;

public class Two extends One {
	
		int a;
		
		/*
		 * public void put(int a) { this.a=a; }
		 */
		
		public static  void greet()
		{
			System.out.println("Hi..good Afternoon...");
		}
		
		public void showAll()
		{
			System.out.println("value of a is : "+super.a);
			System.out.println("value of a is : "+this.a);
			//super.greet();
			//this.greet();
			
		}
}
