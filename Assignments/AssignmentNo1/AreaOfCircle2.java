package AssignmentNo1;
import java.util.Scanner;

public class AreaOfCircle2 {
 public static void main(String[] args) {
	float  ra ;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a radius : ");
	ra=sc.nextFloat();
	 float area =3.14f*ra*ra;
	System.out.println("area of circle: "+area);
	sc.close();
}
}
