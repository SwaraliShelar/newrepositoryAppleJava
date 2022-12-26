/*
2.	If you do this Student s1 = new Student(); Student s2 = s1;

Now print sop(s1) sop(s2) see both reference variables are
pointing to same location.
same example by using caladd
 */
package Constructor;
public class AddRef {
	int addition;

	int add(int x,int y)
	{
		 addition=x+y;
		return addition;
	}
	void display(int add)
	{
		System.out.print("addition is:"+addition+"\n");
	}
public static void main(String[] args) {
	AddRef a1 = new AddRef();
	//AddRef a2 = new AddRef();
	AddRef a2 = a1;
	
	System.out.println(a1);
	System.out.println(a2);
	int ad=a2.add(4,6);
	a2.display(ad);
	/*int ad1=a2.add(2,5);*/
	a1.display(ad);
	
}
}
/*
 A reference variable is a variable that points to an object of a given class, letting you access the value of an object. 
 An object is a compound data structure that holds values that you can manipulate.
 A reference variable does not store its own values.
*/