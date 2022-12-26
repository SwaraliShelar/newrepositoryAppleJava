/*12.Create a class 'Student' with three data members which are name, age and 
address. It has two methods with the same name set_Info(). First method 
has two parameters for name and age and assigns the same whereas the 
second method takes has three parameters which are assigned to name, 
age and address respectively. Print the name, age and address
 */
package AssignmentNo4;

public class Student
{
String name;
int age;
String address;
void set_Info(String name,int age)
{
	this.name=name;
	this.age=age;
}
void set_Info(String name,int age,String address)
{
	this.name=name;
	this.age=age;
	this.address=address;
}
void display()
{
	System.out.println("student name:"+name+"\n"+"student age:"+age+"\n"+"student address:"+address);
}
public static void main(String[] args) 
{
	Student s1=new Student();
	s1.set_Info("pooja",89);
	s1.display();
	System.out.println();	
	s1.set_Info("swara",88,"satara");
	s1.display();
}
}
