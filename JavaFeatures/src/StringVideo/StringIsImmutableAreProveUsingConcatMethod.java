package StringVideo;

public class StringIsImmutableAreProveUsingConcatMethod 
{
public static void main(String[] args) 
{
	String str1=new String("Hello");
	System.out.println("String before concatination:"+str1);
	String str2=str1.concat("world");
	System.out.println("String after concatination:"+str2);
    //str1=str1.concat("world");
	//System.out.println("String after concatination:"+str1);
	
	
	String s1="Good";
	String s2="Luck";
	String s3=s1+s2;
	System.out.println("String s1:"+s1);
	System.out.println("String s2:"+s2);
	System.out.println("String s3:"+s3);

	

}
}
