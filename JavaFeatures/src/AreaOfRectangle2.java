import java.util.Scanner;

public class AreaOfRectangle2 {
 public static void main(String[] args) {
	float l,w;
	System.out.println("enter length and width : ");
	Scanner sc=new Scanner(System.in);
	l=sc.nextFloat();
	w=sc.nextFloat();
	float rect= l*w;
	System.out.println("area of rectangle :"+rect);
	sc.close();
	
}
}
