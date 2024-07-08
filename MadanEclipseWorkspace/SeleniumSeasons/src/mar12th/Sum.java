package mar12th;

public class Sum {
	

	/*
	public void sum(int x,int y) 
	{
		System.out.println("Sum is: "+(x+y));
	}
	
	public void sum(int x,int y,int z) 
	{
		System.out.println("Sum is: "+(x+y+z));
	}
	*/
	
	
	public void add(int... x)
	{
		System.out.println(x.length);
		int res=0;
		for(int i=0;i<x.length;i++)
		{
			res=res+x[i];
		}
		
		System.out.println("Sum is "+res);
	}

}
