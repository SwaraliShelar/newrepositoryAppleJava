package Assignment5ByConstructor;

public class Mdate {
	
	String day;
	int  month, year;
	//using constructor
	Mdate(String day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{
		return "Day:"+day+"\nMonth:"+month+"\nYear:"+year;
	}
}
