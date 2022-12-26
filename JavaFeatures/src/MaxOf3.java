import java.util.Scanner;

public class MaxOf3 {
public static void main(String[] args) {
	
	 int max=0;
	 Scanner sc=new Scanner(System.in);
	
	 int no1=sc.nextInt();
	 int no2=sc.nextInt();
	 int no3=sc.nextInt();
	 
	 if(no1>=no2 &&no1>=no3)
	 {
		 
		 max=no1;
	 }
	 else if(no2>=no1 && no2>=no3)
	 {
		 max=no2;
	 }
	 else
	 {
		 max=no3;
	 }
	 System.out.println(max);
	 sc.close();
}
}
