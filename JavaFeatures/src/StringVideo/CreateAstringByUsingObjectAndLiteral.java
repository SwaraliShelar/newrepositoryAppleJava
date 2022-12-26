package StringVideo;

public class CreateAstringByUsingObjectAndLiteral 
{
public static void main(String[] args) 
{
	String str1="java language";
//it create the str1 reference at stack memory and 
//it create the 1 object or (literal) in string constant pool if object is not there

   String str2="java language";
//it create the str2 reference at stack memory but it cannot create a object (literal) in string constant pool
//because it is already available in string constant pool
   
   String str3=new String("is programming lang");
   //here one object is created at memory heap and one object is created at string constant pool
   //for String constant pool "is programming lang" have a internal reference is created by jvm
   
   String str4=new String("is programming lang");
   //here one object is created at memory heap it is not created at string constant pool because its already there

  /* System.out.println(str1+"\n"+str2+"\n"+str3+"\n"+str4);
   
   System.out.println(str1==str2);
   System.out.println(str1.equals(str2));
   
   System.out.println(str3==str4);//it also created in heap memory thats why there memory location is not same
   System.out.println(str3.equals(str4));//it contains the same content of string in the 
 */
}
}
