/*1. WAJP2 create a class Kid with method readBook() and another method readBook () with 2 parameters. 
The method readBook here is over-loaded (same method name but different parameters) 
 */

package WrittenTest8;

public class Kid
{
	
public void readBook(){}
//System.out.println("same method name without anything .this is default method");
public void readBook(String a,int b)
{
	System.out.println("there are "+b+" copies of "+a+" book ");
}
/*public static void main(String[] args)
{
	Kid k=new Kid();
	k.readBook();
	k.readBook("tom and jerry cartoon",2);
}*/
}
// mahabharat  ramayan