package ArrayObject;

public class MovieGS {
	int id;
	String name;
	int year;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString()
	{
		return "\nid:"+id+"\nMovie name:"+name+"\nYear:"+year;
	}
}
