package Inheritance.ParentChild;

public class FatherSonDaughterMain
{
public static void main(String[] args) {
	Son s=new Son();
	s.setAge(22);
	s.setName("Aditya");
	
	System.out.println("Sons Inforamtion");
	System.out.println("Age:"+s.getAge()+"\nName:"+s.getName()+"\nSurname:"+s.getSurname());
	s.education();
	s.Address();
	
	Daughter d=new Daughter();
	d.setAge(24);
	d.setName("swarali");
	
	System.out.println("Daughters Inforamtion");
	System.out.println("Age:"+d.getAge()+"\nName:"+d.getName()+"\nSurname:"+d.getSurname());
    d.education();
    d.Address();
}
}
