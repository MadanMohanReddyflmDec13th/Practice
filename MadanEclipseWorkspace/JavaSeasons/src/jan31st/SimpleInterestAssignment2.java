package jan31st;

public class SimpleInterestAssignment2 {

	public static void main(String[] args) {
		
		System.out.println("Start of Program");
		SimpleInterestAssignment2 obj2=new SimpleInterestAssignment2();
		obj2.simpleInterest(10000, 12, 2);
		obj2.simpleInterest(20000, 12, 2);
		obj2.simpleInterest(30000, 12, 2);
		System.out.println("End of Program");
	}
	
	public void simpleInterest(int p,int t,int r) {
		double res=(p*t*r)/100;
		System.out.println(res);
	}

}
