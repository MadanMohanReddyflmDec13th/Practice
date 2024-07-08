package Jan29thOperators;

public class OperatorsDemo1 {

	public static void main(String[] args) {
		int x=20;
		//++x;
		
		//System.out.println(x);
		
		int y=30;
		
		//int res=++x*y; PreIncrement //630
		//int res=x++*y; PostIncrement //600
		//int res=--x*y; PreDecrement //570
		int res=x--*y;
		System.out.println(res); 
		
		System.out.println(x);

	}

}
