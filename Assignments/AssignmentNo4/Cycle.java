/*9. Create a class Cycle with member variables:
 int accountNo, int noOfWheels
a. Create a default constructor with a write in it “I am default 
constructor”
b. Create another constructor which takes 2 arguments, calls the default 
constructor using this keyword and has a print in it “I am another 
constructor”.
c. In main method, create an object of type Cycle by using default 
constructor(Note the output)
d. Create another object of type Cycle by using the parameterized 
constructor( Note the sequence of print indicating that inner most 
constructor is called first)*/
package AssignmentNo4;

public class Cycle {
	 int accountNo;int  noOfWheels;
	 Cycle()
	 {
		 System.out.println("I am default Constructor");
	 }
	 Cycle(int accountNo,int noOfWheels)
	 {
		 this.accountNo=accountNo;
		 this.noOfWheels=noOfWheels;
		 System.out.println("I am another constructor");
	 }
	 
	 public static void main(String[] args)
	 {
		Cycle c1=new Cycle();	
		Cycle c2=new Cycle(12345,4);
		System.out.println("accountNo:"+c2.accountNo+" "+"noOfWheels:"+c2.noOfWheels);
	 }
}
