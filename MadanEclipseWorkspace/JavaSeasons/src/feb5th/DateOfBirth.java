package feb5th;

public class DateOfBirth {
	
	private int day;
	private String month;
	private int year;
	
	public void setDOB(int dd,String mm,int yyyy)
	{
		day=dd;
		month=mm;
		year=yyyy;
		
	}
	
	public void getDOB()
	{
		//System.out.println(day+":"+month+":"+year);
		System.out.printf("%02d:%s:%d",day,month,year);
	}

}
