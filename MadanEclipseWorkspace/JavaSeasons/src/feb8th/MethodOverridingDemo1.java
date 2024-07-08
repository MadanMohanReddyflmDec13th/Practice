package feb8th;

public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		
		//case1
		P obj=new P();
		obj.m1();
		
		//case2
		C obj2 =new C();
		obj2.m1();
		
		//case3
		P obj3 =new C();   //overriding
		obj3.m1();
		System.out.println(obj3.x); //output is 10 bcz variables can't override
		
		//case4
		//C obj4=new P();  //error
		//obj4.m1();
		
		
			

	}

}
