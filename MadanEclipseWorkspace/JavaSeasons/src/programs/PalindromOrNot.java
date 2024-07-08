package programs;

public class PalindromOrNot {

	public static void main(String[] args) {
		
		int num=151;
		int sum=0;
		int rem;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		if(sum==temp)
		{
			System.out.println("Palimdrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}


	}

}
