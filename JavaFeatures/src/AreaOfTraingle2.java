import java.util.Scanner;
public class AreaOfTraingle2 {
 public static void main(String[] args) {
	float b,h;
	System.out.println("enter base and height");
	Scanner sc=new Scanner(System.in);
	 b =sc.nextFloat();
	 h =sc.nextFloat();
	 float area=0.5f * b* h;
	 System.out.println("rea of triangle: "+area);
	 sc.close();
	
}
}
