package feb8th;

public class AbstractDemo1 {

	public static void main(String[] args) {
		
		Numbers obj=new Sum();
		obj.compute(10,20);
		obj.greet();
		
		Numbers obj2=new Sub();
		obj2.compute(10,20);
		
		
	}

}
