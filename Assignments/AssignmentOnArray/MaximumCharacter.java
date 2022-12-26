package AssignmentOnArray;

import java.util.Arrays;

/*18. WAP to find max character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, 
‘R’, ‘Z’, ‘p’], so max character is ‘x’. 
 */
public class MaximumCharacter 
{
public static void main(String[] args) {
	char c[]= {'A','D','E','x','R','Z','p'};
	 System.out.println("original array:"+Arrays.toString(c));
	 for(char i=0;i<c.length;i++ )
	 {
		 for(int j=0;j<c.length-1;j++)
		 {
			 if(c[j]>c[j+1])
			 {
				 char temp=c[j];
				 c[j]=c[j+1];
				 c[j+1]=temp;
				 
			 }
		 }
	 }
	 System.out.println("new array:"+Arrays.toString(c));
	 System.out.println("Maximum value of array is:"+c[c.length-1]);
	// System.out.println("Minimum value of array is:"+c[0]);

}

}
