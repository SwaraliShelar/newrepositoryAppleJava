//find the second value of the marks
public class StudentFindValueFromIndex
{
public static void main(String[] args)
{
	int m1[]= {81,89,45,99,55};
	int m2[]= {98,78,67,98,45};
	int m3[]= {90,89,87,67,90};
	
	Student stud[]=new Student[3];
	
	Student s1=new Student();
	s1.setId(101);
	s1.setName("swarali");
	s1.setMarks(m1);
	stud[0]=s1; 
	
	Student s2=new Student();
	s2.setId(102);
	s2.setName("rajani");
	s2.setMarks(m2);
	stud[1]=s2;
	
	Student s3=new Student();
	s3.setId(103);
	s3.setName("shweta");
	s3.setMarks(m3);
	stud[2]=s3;
	
    
	//display the marks student 102 at index 2
	for(Student s:stud)
	{
		/*if(s.getId()==102)//marks of student id 102 at index 2
		{
		int a[]=s.getMarks();
		System.out.println(a[2]);
		}
		*/
		int a[]=s.getMarks();//marks at index 2 of all students
		System.out.println(a[2]);
		
		/*(display the marks of all student at index 2
		 int a[]=s.getMarks();
		System.out.println(s.getMarks()[2]);
		 if(s2.getId()!=0)
		{
			for(int i=0;i<stud.length;i++)
			{
				if(i==2)
				{
					System.out.println(s.getMarks()[i]);
				}
			}
		}*/
		//display all records
		//System.out.println(s);
	}
}

}
