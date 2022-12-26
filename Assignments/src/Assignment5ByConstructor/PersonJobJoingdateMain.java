package Assignment5ByConstructor;

public class PersonJobJoingdateMain 
{
	public static void main(String[] args) {

Joiningdate jd1=new Joiningdate("Monday",11,2020);
Job j1=new Job(126,"software developer",22,jd1);
Person p1=new Person(1,"pooja",j1);
System.out.println(p1);
}
}