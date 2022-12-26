package WhileLoopExample;

import java.util.Scanner;

public class MinMaxNumInDigit {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();//5678
	int r,min,max;
	min=num%10;//min=5678%10=8 min=567%10=7 min=56%10=6 min=5%10=5
	max=num%10;//max=5678%10=8 max=567%10=7 max=56%10=6 max=5%10=5
	
	while(num!=0)// num=5678      num=567        num=56      num=5     num=0
	{
		r=num%10;//     r=8        r=7           r=6         r=5
		if(r<min) {//   r<8        r<7           r<6        r<5(min=r)
			min=r;//    min=8      min=7         min=6       min=5
		}
		num=num/10; //num=5678/10  num=567/10  num=56/10    num=5/10   num=0
		if(r>max) {// (max=r)r>8    r>7           r>6        r>5
			max=r;//    max=8       max=7         max=6      max=5
		}
		num=num/10;//num=5678/10  num=567/10  num=56/10    num=5/10   num=0
	}
	System.out.println("minimun number is:"+min);
	System.out.println("maximun number is:"+max);
		sc.close();
}
}
