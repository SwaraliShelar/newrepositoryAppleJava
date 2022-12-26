package AssignmentNo1;
import java.util.*;
public class ArithmaticOp {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a two values a and b : ");
	 float a=sc.nextFloat();
	 float b=sc.nextFloat();
	 float add=a+b;
	 float sub=a-b;
	 float mul=a*b;
	 float div=a/b;
	 System.out.println(" \n Addition of a and b : "+add+"  \n substraction of a and b : "+sub +"\n Multiplication  of a and b : "+mul+"\n division of a and b : "+div);
}
}
