package programs;

public class CheckANumberisArmstrong {

	public static void main(String[] args) {
		
		int num=153;
		int res=0;
		int rem;
		int temp=num;
		
		while(num>0) 
		{
			rem=num%10;
			num=num/10;
			res=res+(rem*rem*rem);
		}
		
		if(res==temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
