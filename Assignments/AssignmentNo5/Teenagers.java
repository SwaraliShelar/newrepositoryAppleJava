/*9. Create a class Teenager which extends Kid created above and Implement 
readBook() differently in Teenager class. In main method, declare two 
variables k1,k2 of type Kid. Create objects of type BigKid and Teenager such 
that K1 should reference object of class BigKid and K2 should reference 
object of class Teenager, Call their respective readBook() methods
 */
package AssignmentNo5;
class Teenagers extends Kid
{
	public void readBook()
	{
		System.out.println("ths Books for above #13 years teenagers");
	}
	/*public static void main(String[] args) 
	{
	Teenagers t=new Teenagers();
	t.readBook();
}*/
}
