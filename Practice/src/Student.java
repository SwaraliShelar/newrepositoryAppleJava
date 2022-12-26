import java.util.Arrays;

public class Student 
{
int id;
String name;
int marks[];
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
public void setMarks(int marks[])
{
	this.marks=marks;
}
public int[] getMarks()
{
	return marks;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
}
}
