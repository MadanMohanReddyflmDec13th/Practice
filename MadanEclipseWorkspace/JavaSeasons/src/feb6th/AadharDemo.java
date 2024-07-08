package feb6th;

public class AadharDemo {

	public static void main(String[] args) {
		
		Aadhar a1=new Aadhar();
		
		//Using passport only
		a1.setAadhar("1111");
		a1.getAadhar();
		
		//Using pan And Passport
		a1.setAadhar("FRIPR2346",567890);
		a1.getAadhar();
	}

}
