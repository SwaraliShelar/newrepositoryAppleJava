package ClassObjectHomeVideo;

public class StudentInf {
	//these is instances of variable that can create separate copy of each object
int id;
String name;
int m1,m2,m3;
float per;
void acceptDetails(int id1,String name1,int m11,int m12,int m13)
{
	id=id1;
	name=name1;
	m1=m11;
	m2=m12;
	m3=m13;
}
void percentage()
{
	per=(m1+m2+m3)/3;
}
void showDetails()
{
System.out.println("\nstudent id:"+id+"\nstudent name:"+name+"\nstudent marks:"+m1+ " " +m2+ " " +m3+"\nstudent percentage:"+per);
}
public static void main(String[] args) {
	StudentInf s1=new StudentInf();
	StudentInf s2=new StudentInf();
	//these is instances of variable that can create separate copy of each object
//there is two objects s1,s2 and have separate values
	//s1=1,"swara",56,78,89;
	//s2=2,"pooja",45,78,90;
	s1.acceptDetails(1,"swara",56,78,89);
	s1.percentage();
	s1.showDetails();
	s2.acceptDetails(2,"pooja",45,78,90);
	s2.percentage();
	s2.showDetails();

}
}
