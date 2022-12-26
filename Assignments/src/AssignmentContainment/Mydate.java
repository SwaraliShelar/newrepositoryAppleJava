package AssignmentContainment;

public class Mydate {
	private String day, month, year;

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	public String toString()
	{
		return "Day:"+day+"\nMonth:"+month+"\nYear:"+year;
	}
}
