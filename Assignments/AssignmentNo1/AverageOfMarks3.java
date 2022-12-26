package AssignmentNo1;
import java.util.Scanner;

public class AverageOfMarks3 {
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 5 subjets marks of student:");
	
		 float s1=sc.nextFloat(); 
		 float s2=sc.nextFloat(); 
		 float s3=sc.nextFloat(); 
		 float s4=sc.nextFloat();
		 float s5=sc.nextFloat();
		 
		 System.out.println("HTML : "+s1);
		 System.out.println("marathi : "+s2);
		 System.out.println("histry : "+s3);
		 System.out.println("Geography : "+s4);
		 System.out.println("maths : "+s5);
		 
		 float total =(s1+s2+s3+s4+s5);
		 float avg =total/500;
		 float per=avg*100;
		 System.out.println("total of marks : "+total);
		 System.out.println("Average of marks : "+avg);
		 System.out.println("persentage of marks : "+per);
		 if (per >=75)
		 {
			 System.out.println("distinction");
		 }
		 else if (per>=65)
		 
			 System.out.println("first class");
		 
		 else if (per>=55)
		 
			 System.out.println("second class");
		 
		 else
		 {
			 System.out.println("fail");
		 }
		 sc.close();
		
	}
}
