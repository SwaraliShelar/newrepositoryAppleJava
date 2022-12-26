package AssignmentNo5;

public class Mdate {
	
	String day;
	int  month, year;
	public void setDay(String day)
	{
		this.day=day;
	}
	public String getDay()
	{
		return day;
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
	public int getMonth()
	{
		return month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return year;
	}
	public String toString()
	{
		return "Day:"+day+"\nMonth:"+month+"\nYear:"+year;
	}
}
