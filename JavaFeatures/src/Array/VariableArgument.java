package Array;

public class VariableArgument
{
//variable argument is	float[] marks - Array.VariableArgument.student(String, String, float...) 
float sum=0;
void student(String name,String dept,float...marks)
{
	System.out.println("\nName:"+name+"\nDept:"+dept);
	
	for(int i=0;i<marks.length;i++)
	{
		sum=sum+marks[i];
	}
	System.out.println("total:"+sum+"\naverage of marks:"+sum/marks.length);
}
public static void main(String[] args) 
{
	VariableArgument va=new VariableArgument();
	va.student("rajesh","commerce",98,78,90,76,98,90);
	va.student("prasad","science",80,89,78,90);
	
}
}
