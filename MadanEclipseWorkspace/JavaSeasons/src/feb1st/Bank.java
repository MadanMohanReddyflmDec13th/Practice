package feb1st;

public class Bank {
	
	private double balance=10000;
	
	//getters(if we retrive anything that is getter)
	public void getBalance(int pin) {
		//validations
		if (pin==1234) 
		{
			System.out.println(balance);
		}
		else 
		{
			System.out.println("Invalid PIN");
		}
	}
	
	//setters
	public void setBalance(double deposit) {
		balance=balance+deposit;
	}

}
