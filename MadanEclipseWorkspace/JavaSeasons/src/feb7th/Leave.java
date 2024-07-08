package feb7th;

public class Leave extends Marks {
	
	int sl,cl;
	
	public void setLeaves(int sl,int cl)
	{
		this.sl=sl;
		this.cl=cl;
	}
	public void getLeaves()
	{
		System.out.println("Total leaves taken: "+(sl+cl));
	}

}
