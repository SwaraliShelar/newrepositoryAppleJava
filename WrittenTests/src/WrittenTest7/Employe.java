package WrittenTest7;
//single inheritance using super and this keyword
public class Employe extends Person
{
	  float salary;
  Employe(int age,String name,float salary)
  {
	  super(age,name);//reusing parent constructor
	  this.salary=salary;
  }
  void display()
  {
	  System.out.println("Age:"+age+"\nName:"+name+"\nSalary:"+salary);
  }
}
