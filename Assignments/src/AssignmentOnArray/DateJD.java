package AssignmentOnArray;

public class DateJD
{
String day;
int month,year;
public String getDay() {
	return day;
}
public void setDay(String day) {
	this.day = day;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String toString()
{
	return"\nDay:"+day+"  Month:"+month+"  Year:"+year;
}
}
