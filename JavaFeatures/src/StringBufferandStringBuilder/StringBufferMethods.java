package StringBufferandStringBuilder;

import java.util.Scanner;

public class StringBufferMethods 
{
public static void main(String[] args)
{
	
	/*StringBuffer sbf=new StringBuffer();//default capacity of string buffer is 16
    System.out.println("default capacity of string buffer is:"+sbf.capacity());
   
	//StringBuffer sbf=new StringBuffer("java");
    System.out.println("capacity of string buffer is:"+sbf.capacity());//after passing a java as String object 
    */
    StringBuffer sbf2=new  StringBuffer();
    sbf2.ensureCapacity(50);
    System.out.println(sbf2.capacity());
    
    StringBuffer sbf1=new StringBuffer("java language");
   // System.out.println("capacity of string buffer is:"+sbf1.capacity());//after passing a java language as String object 
  //  System.out.println(sbf1.length());//29-16=13
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");//also advance programming lang
    String s1=sc.nextLine();
    //sbf1.append(s1);//The append method is mainly used to append or add data in a file.
    //System.out.println(sbf1);//java languagealso advance programming lang

    s1.concat(" core");
    System.out.println("String:"+s1);
    
 sbf1.append(" Core");
 System.out.println("String buffer:"+sbf1);
 System.out.println(sbf1);
// System.out.println(sbf1.length());//java languagecore
//System.out.println(sbf1.capacity());//(Default StringBuffer capacity=16)+java language
  
 
 //sbf1.reverse();
 //System.out.println(sbf1);//change is actually happen in original values of string buffer

//0123456789 
//java language core
 sbf1.delete(5, 9);//end-start  9-5=4
 System.out.println(sbf1);//java uage Core
  
 //                   01234567890
 sbf1.deleteCharAt(2);//java uage Core
 System.out.println(sbf1);

 //sbf1.ensureCapacity(50);
 
 sbf1.setCharAt(2, 'H');
 System.out.println(sbf1);
 
 sbf1.insert(1, "vaaa");//index ,charactersequence
 System.out.println(sbf1);

}
}
