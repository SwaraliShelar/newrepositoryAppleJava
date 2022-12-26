/*8. WAP to create a class Kid with method readBook() and another method 
readBook () with 2 parameters. The method readBook here is over-loaded. 
Create a class BigKid which extends Kid created above and Implement 
readBook() differently in BigKid class. Here the method readBook() has 
been over-ridden in the child class BigKid().
 */
package AssignmentNo5;

public class Bigkid extends Kid
{
public void readbook(String name,int num)
{
	//super.readBook();
	System.out.println("the book is for BigKids means for teenagers there age should be above 13 the Book name is "+name+" and "+num+" copies of books are available.");
}
/*public static void main(String[] args)
{
	Bigkid b=new Bigkid();
	b.readBook();
	b.readbook("herry potter",13,7);
	b.readBook();
	b.readBook("tom and jerry cartoon",5);
	
}*/
}