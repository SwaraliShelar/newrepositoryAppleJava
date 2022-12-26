/*7. Below code is showing compile time error. Can you suggest the 
corrections?*/
package AssignmentNo5;

class X
{
 public X(int i)
 {
 System.out.println(1);
 }
}
class Y extends X
{
 Y()
 {
	 super(7);
 }
 {
 System.out.println(2);
 }
 
}

