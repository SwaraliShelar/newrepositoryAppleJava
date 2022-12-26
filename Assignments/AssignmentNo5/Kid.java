/*8. WAP to create a class Kid with method readBook() and another method 
readBook () with 2 parameters. The method readBook here is over-loaded. 
Create a class BigKid which extends Kid created above and Implement 
readBook() differently in BigKid class. Here the method readBook() has 
been over-ridden in the child class BigKid().
 */
package AssignmentNo5;

public class Kid
{
	String name;
	int num;
//public void readBook(){}
//System.out.println("same method name without anything .this is default method");
public void readBook(String name,int num)
{
	System.out.println("there are "+num+" copies of "+name+" book and these book for 12 old kids");
}
/*public static void main(String[] args)
{
	Kid k=new Kid();
	k.readBook();
	k.readBook("tom and jerry cartoon",2,12);
}*/
}
// mahabharat  ramayan