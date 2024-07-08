package feb6th;

public class Aadhar{
	
	private String pan;
	private int passport;
	//private String voter;
	
	public void setAadhar(String pan)
	{
		this.pan=pan;
	}
	
	public void setAadhar(int passport)
	{
		this.passport=passport;
	}
	
	/*(I commented it bcz not allowing to create method with same argument type)
	 (Error : dupliacte method)
	
	public void setAadhar(String voter)
	{
		this.voter=voter;
	}
	*/
	
	public void setAadhar(String pan,int passport)
	{
		this.pan=pan;
		this.passport=passport;
	}
	
	/*
	public void setAadhar(int passport, String voter)
	{
		this.passport=passport;
		this.voter=voter;
	}
	
	public void setAadhar(String pan, String voter)
	{
		this.pan=pan;
		this.voter=voter;
	}
	
	
	public void setAadhar(String pan,int passport,String voter)
	{
	
		this.pan=pan;
		this.passport=passport;
		this.voter=voter;
	}
	*/
	public void getAadhar() 
	{
		int first=(int)(Math.random()*10000);
		int middle=(int)(Math.random()*10000);
		int last=(int)(Math.random()*10000);
		
		System.out.printf("%04d %04d %04d",first,middle,last);
		System.out.println();
	}
	
}

