package StringAssignment;
//2.Compare string using == when “” is present see same reference is there
public class UsingADoubleequaltoCompare 
{
public static void main(String[] args) 
{
	String s1="swarali";
	String s3="swarali";
	
	System.out.println(s1+" "+s3);
	System.out.println(s1==s3);//true (because both refer to same instance)  
	System.out.println(s1.compareTo(s3));

	/*String s1="swarali";
	String s2=new String("swarali");
	
	System.out.println(s1+" "+s2);
	System.out.println(s1==s2);//false(because s3 refers to instance created in nonpool)  
	System.out.println(s1.compareTo(s2));*/

}
}
