package ForLoop;

import java.util.Scanner;

public class ArmstrongNumberUsingForLoop {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0, cnt = 0, temp = num;
        //temp=1634
		while (temp != 0) {   //   temp=370          temp=37          temp=3      temp=0
			cnt++;             //    cnt=3            cnt=2            cnt=1
     //System.out.print(+cnt);
			temp = temp / 10; // temp=370/10=37   temp=37/10=3      temp=3/10=0  temp=1/10=0
		}
//because in above while temp becomes 0 thats why we reinitialize temp =num
		
		temp = num; 
		while (temp != 0) {                  //temp=370                                              //temp=37                                                //temp=3                            //temp=0                                  
			int power = 1;                  // power=1                                               //power=1                                                //power=1                                                 
			int r = temp % 10;             //r=370%10=0                                            //r=37%10=7                                               //r=3%10=0                                                 
			for (int i = 1; i <= cnt; i++)//i=1         i=2        i=3       i=4          //i=1         i=2       i=3          i=4               //i=1         i=2       i=3          i=4              
			{                                      //cnt=3 thats i=1 2 3                                   //cnt=3 thats i=1 2 3                                    //cnt=3 thats i=1 2 3                                          
				power = power * r;      //p=1*3=3    p=3*3=9  p=9*3=27                   //p=1*7=7    p=7*7=49  p=49*7=343                          //p=0*0=0                      
			}
			
			sum = sum + power;                                         //sum=sum+27=27                                         //sum=27+343=370                                    //sum=370+0=370                                  
			temp = temp / 10;                                         //temp=370/10=37                                        //temp=37/10=3                                      //temp=3/10=0                                
		}
		if (sum == num) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");

		}
		sc.close();
	}
}
