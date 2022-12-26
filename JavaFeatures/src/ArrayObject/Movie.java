package ArrayObject;

public class Movie {
int id;
String name;
int yearOfRelease;
Movie(int id,String name,int yearOfRelease)
{
	this.id=id;
	this.name=name;
	this.yearOfRelease=yearOfRelease;
}
public String toString()
{
	return "\nid:"+id+"  name:"+name+"  yearOfRelease:"+yearOfRelease;
}
}
