package jan31st;

public class SimpleInterestAssignment {

	public static void main(String[] args) {
		//calculating SimpleInterest
		
		System.out.println("Start of program");
		SimpleInterestAssignment obj1=new SimpleInterestAssignment();
		System.out.println(obj1.simpleInterest(100000,12,2));
		System.out.println(obj1.simpleInterest(200000,12,2));
		System.out.println(obj1.simpleInterest(300000,12,2));
		System.out.println("End of program");		

	}
	
	public double simpleInterest(int p,int t,int r) {
		double res=(p*t*r)/100;
		return res;
		
		}
	
}
