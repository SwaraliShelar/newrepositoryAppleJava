package Containment;

public class Faculty {
private String name,teachingsubject;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getTeachingsubject() {
	return teachingsubject;
}

public void setTeachingsubject(String teachingsubject) {
	this.teachingsubject = teachingsubject;
}
public String toString()
{
	return "\nFaculty Name:"+name+"\nFaculty teaching subject:"+teachingsubject;
}
}
