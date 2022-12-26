package Inheritance.ParentChild;

public class MyDateMyTimeMain 
{
	public static void main(String[] args) {
		
	
MyTime mt=new MyTime();
mt.setHrs(11);
mt.setMin(30);
mt.setSec(55);

mt.setDd(28);
mt.setMm(11);
mt.setYy(2022);

mt.display();
//static variacle access by using child class or object
System.out.println(MyTime.month);
}
}