package feb5th;

public class Clock {
	
	private int hr,min,sec;
	
	//setters
	public void setClock(int h,int m,int s)
	{
		hr=h;
		min=m;
		sec=s;
	}
	
	//getters
	public void getClock() 
	{
		System.out.println(hr+":"+min+":"+sec);
		System.out.printf("%02d:%02d:%02d",hr,min,sec);//formatting
	}

}
