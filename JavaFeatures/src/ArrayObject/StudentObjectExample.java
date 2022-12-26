package ArrayObject;

public class StudentObjectExample
{
	//refer one program student

	public static void main(String[] args) 
	{
    Student stud[]=new Student[10];
    stud [0]=new Student(1,90,"swarali","computery");
    stud [1]=new Student(2,78,"pooja","Maths");
    stud [2]=new Student(3,60,"raj","biology");
    stud [3]=new Student(4,78,"uday","computer");
    stud [4]=new Student(5,60,"aditya","biology");
    stud [5]=new Student(6,78,"anisha","Maths");
    stud [6]=new Student(7,50,"santoshi","computer");
    stud [7]=new Student(8,68,"sakhi","mechanical");
    stud [8]=new Student(9,90,"guari","computer");
    stud [9]=new Student(10,88,"reshma","computer");
	
    for(Student s:stud)
    {
    	if(s.marks>=65 && s.dept=="computer")
    	System.out.println(s);
    }
}
}