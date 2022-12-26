package Array;

import java.util.Arrays;

public class ReverseANumberUsing3VaribleTemp {
	public static void main(String[] args) {
		 int a[]= {1,2,3,4,5,6,7,8};
			int n=a.length;
			int mid=n/2;
		    System.out.println(Arrays.toString(a));
			for(int i=0;i<mid;i++)//i=0                  i=1                 i=2                  i=3
			{
				int temp=a[i];//temp=a[0]                a[1]               a[2]                 a[3]
				a[i]=a[mid+i];//a[0]=a[4+0]=a[4]   a[1]=a[4+1]=a[5]     a[2]=a[4+2]=a[6]    a[2]=a[4+3]=a[7]
				a[mid+i]=temp;//a[4]=5                a[5]=6               a[6]=7                a[7]=8
			}
		    System.out.println(Arrays.toString(a));	
	}

}
