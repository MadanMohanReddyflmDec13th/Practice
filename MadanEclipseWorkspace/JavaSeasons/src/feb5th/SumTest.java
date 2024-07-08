package feb5th;

//Polymorphism (Compiletime polymorphism or static polymorphism)
public class SumTest {

	public static void main(String[] args) {
		
		//Method Overloading
		Sum obj1=new Sum();
		
		//user1
		obj1.add(10,20);
		
		//user2
		//obj1.addDouble(10.22,20.33);
		obj1.add(24.45,24.55);
		
		//user3 (1.differnce in datatypes of arguments)
		obj1.add(2200033000L,3300033000L);
		
		//user4 (2.differnce in no.of arguments)
		obj1.add(10,20,30);
		
		//user5 (3.change in order of arguments)
		obj1.add(26,"September");
		//user6
		obj1.add("Sept",26);

	}

}
