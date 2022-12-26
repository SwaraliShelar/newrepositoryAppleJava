/*  Create a student class student has ID ,name, 3 subject marks .
  create a first method to accept the detail from student .
  create 2nd method to calculate the percentage .
  create 3rd method to display details of student id name and marks of three sub.
 */
package Tasks;
public class StudentInfo2 {
	int id;
	String name;
	int m1;
	int m2;
	int m3;
	int total;
	float per;
	void acceptDetail(int id1,String name1,int ma1,int ma2,int ma3)
	{
		id=id1;
		name=name1;
		m1=ma1;
		m2=ma2;
		m3=ma3;
		
	}
	void percentage()
	{
	  total=m1+m2+m3;
	  per=total/3;
	}
	void displayDetail()
	{
		System.out.println("student id:"+id+"\nstudent name:"+name+"\nstudent marks of 3 subject:"+m1+" "+m2+" "+m3+" "+"\nTotal marks:"+total+"\npercentage:"+per);
	}
	public static void main(String[] args)
	{
		StudentInfo2 si=new StudentInfo2();
		si.acceptDetail(1,"swara",45,78,90);
		si.percentage();
		si.displayDetail();
	}
 }
