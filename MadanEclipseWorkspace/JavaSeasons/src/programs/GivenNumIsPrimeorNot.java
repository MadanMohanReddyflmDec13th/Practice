package programs;

public class GivenNumIsPrimeorNot {

	public static void main(String[] args) {
		
		int num=11;
		int temp=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
				break;
			}
		}
		
		if(temp==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not a prime");
		}

	}

}
