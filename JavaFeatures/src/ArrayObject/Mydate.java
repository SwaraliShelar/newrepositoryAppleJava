package ArrayObject;

public class Mydate {
String day;
int month;
int year;

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
	return "Day:"+day+"  Month:"+month+"  Year:"+year;
}
}
