/*10.Create a class Student with 4 variables called as rollNo, admissionNo, age, 
courseId.Each of the variables should have one of the access modifier -
public, protected, no-access-modifier and private.Add 4 methods in the 
class – public, method doPublic, no access modifier method doDefault, 
protected method doProtected, private method doPrivate.
a. In main method outside the class but in same package – create object of 
type Student.
b. Try to access rollno outside the class.
c. Try to access age outside the package.
d. Also try to access private methods outside the class and protected 
methods outside the package
 */
package AssignmentNo3;

public class Student10 
{
	 public int rollNo;
	 protected int admissionNo;
     int age;//default
	 private int courseId;
	
	 public void setRollNo(int rollNo)
	 {
		 this.rollNo=rollNo;
	 }
	 public int getRollNo()
	 {
		 return rollNo;
	 }
	 protected void setAdmissionNo(int admissionNo)
	 {
		 this.admissionNo=admissionNo;
	 }
	 protected int getAdmissionNo()
	 {
		 return admissionNo;
	 }
	 void setAge(int age)
	 {
		 this.age=age;
	 }
	 int getAge()
	 {
		 return age;
	 }
	 private void setCourseId(int  courseId)
	 {
		 this. courseId= courseId;
	 }
	 private int getCourseId()
	 {
		 return  courseId;
	 }
}
