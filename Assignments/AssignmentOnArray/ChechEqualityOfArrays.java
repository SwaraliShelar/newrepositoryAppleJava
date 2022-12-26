package AssignmentOnArray;

import java.util.Arrays;

/*9. Write a Java program to test the equality of two arrays. 
 * Means e.g arr1[] = [12, 22,32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22]
 * Here both arrays are equal */
public class ChechEqualityOfArrays 
{
	public static void main(String[] args) 
	{
    int arr1[]= {12,22,32,42,52,62};
    int arr2[]= {52,22,62,12,42,22};
    int flag=0;
    if(arr1.length==arr2.length)
    {
    	for(int i=0;i<arr1.length;i++)
    	{
    		if(arr1[i]!=arr2[i])
    		{
    			flag=1;
    		}
    	}
    }
    else
    {
    	flag=1;
    }
    if(flag==0)
    {	
        System.out.println("Arrays are equal");
    }
    else
    {   
        System.out.println("Arrays are not equal");
    }
    }
}
    
/*   // using a Arrays.equals(); using predefine method
    boolean result = Arrays.equals(arr1, arr2);//using boolean
    if (result == true) {
        // Print the result
        System.out.println("Two arrays are equal");
    }
    else {
        // Print the result
        System.out.println("Two arrays are not equal");
    }
	}}
    
  */  
/*    //using a Arrays.equals(); using predefine method
    if(Arrays.equals(arr1, arr2))
    {
    	System.out.print("equals");
    }
    else
    {
    	System.out.print("not equals");
    }
	}
}
*/