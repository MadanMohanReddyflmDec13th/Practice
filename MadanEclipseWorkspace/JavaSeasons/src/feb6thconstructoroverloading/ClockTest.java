package feb6thconstructoroverloading;

public class ClockTest {

	public static void main(String[] args) {
		
		Clock c1=new Clock();
		c1.getClock();
		
		Clock c2=new Clock(4);
		c2.getClock();

		Clock c3=new Clock(4,55);
		c3.getClock();

		Clock c4=new Clock(4,55,59);
		c4.getClock();


	}

}
