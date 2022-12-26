package Assignment5ByConstructor;

public class Joiningdate {
	String day;
	int  month, year;
Joiningdate(String day,int month,int year)
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
