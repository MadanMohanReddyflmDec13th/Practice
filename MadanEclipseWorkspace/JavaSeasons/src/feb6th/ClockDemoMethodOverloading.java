package feb6th;

//Complie time Polymorphism (Achieved by Method Overloading)

public class ClockDemoMethodOverloading {
	
	public static void main(String []args) {
		
		Clock c1=new Clock();
		
		//user1
		c1.setClock(7);
		c1.getClock();
		
		//user2
		c1.setClock(7,32);
		c1.getClock();
		
		//user3
		c1.setClock(7,32,45);
		c1.getClock();
		
		//user4
		c1.setClock(0,0,3);
		c1.getClock();
	}

}
