import java.util.Scanner;
public class AverageOfMarks2 {
 public static void main(String[] args) {
	 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a marks :");
	 float m1=sc.nextFloat();
	 float m2=sc.nextFloat();
	 float m3=sc.nextFloat();
	 float m4=sc.nextFloat();
	 float m5=sc.nextFloat();
	 float total =(m1+m2+m3+m4+m5);
	 float avg =total/500;
	 float per=avg*100;
	 System.out.println("total of marks : "+total);
	 System.out.println("Average of marks : "+avg);
	 System.out.println("persentage of marks : "+per);

	 sc.close();
	
}
}
