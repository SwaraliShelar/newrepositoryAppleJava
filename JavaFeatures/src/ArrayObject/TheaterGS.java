package ArrayObject;

import java.util.Arrays;

public class TheaterGS {
	int id;
	String name;
	MovieGS m[];
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
	public MovieGS[] getM() {
		return m;
	}
	public void setM(MovieGS[] m) {
		this.m = m;
	}
	public String toString()
	{
		return "\nid:"+id+"\nTheater name:"+name+"\nMovie:"+Arrays.toString(m)+"\n";
	}
}
