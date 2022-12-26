/*2. Create a class BigKid which extends Kid created above.
 *  Implement readBook() differently in BigKid class.
 *  Here the method readBook() has been over-ridden in the child class BigKid() 
 */
package WrittenTest8;

public class Bigkid extends Kid
{
public void readbook(String name,int num)
{
	//super.readBook();
	System.out.println("Books for above and book name is"+name+"+14+"+num+"Bigkids");
}
/*public static void main(String[] args)
{
	Bigkid b=new Bigkid();
	b.readBook();
	b.readBook("herry potter",7);
	//b.readBook();
	//b.readBook("tom and jerry cartoon",2);	
}*/
}