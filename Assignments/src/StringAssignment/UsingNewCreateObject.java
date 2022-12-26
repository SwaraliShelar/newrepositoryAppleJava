package StringAssignment;
//3.Compare string using new operator when new is present see different reference is there
public class UsingNewCreateObject 
{
public static void main(String[] args)
{
	String s1="swarali";
	String s2=new String("swarali");
	
	System.out.println(s1+" "+s2);
	System.out.println(s1==s2);//false(because s3 refers to instance created in nonpool)  
	System.out.println(s1.compareTo(s2));
	
	/*String s1="swarali";
	String s3="swarali";
	
	System.out.println(s1+" "+s3);
	System.out.println(s1==s3);//true (because both refer to same instance)  
	System.out.println(s1.compareTo(s3));*/

}
}
