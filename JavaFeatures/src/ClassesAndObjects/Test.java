/*
1.print 2 objects in sysout and see its hashcode is different
Eg Student@15db9742 and Student@2329742

 */
package ClassesAndObjects;

public class Test {
	
	
	  public static void main(String[] args) {

	    // create an object of the Test class
	    Test obj1 = new Test();
	    Test obj2 = new Test();

	    // print the object
	    System.out.println(obj1);
	    System.out.println(obj2);

	  }
	}
/*
in the above example, we have created an object of the class Test. When we print the object, we can see that the output looks different.

This is because while printing the object, the toString() method of the object class is called. It formats the object in the default format. That is,

WrittenTest4.Test - name of the class
@ - joins the string

2 objects created thats why there is 2 hashcode value

515f550a- hashcode value of the object
cac736f- hashcode value of the object

output of program :-
ClassesAndObjects.Test@515f550a
ClassesAndObjects.Test@cac736f

*/
