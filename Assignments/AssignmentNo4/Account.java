//question1 t0 8
/*1.Create a class Account with member Variable: long accountNo, String customerName,
2.In main, create a new object of the Account class and print the instance 
variables value.
(Note – Default constructor is provided by Java to facilitate the creation of a 
new object, here variables are assigned default values)
3.Create default constructor assign new value to all variables and write “ I 
am in default Constructor”
4. In main, create another object of the Account class and print the member 
variables value.
(Note – Since you have defined a (default) constructor, Java does not 
provide another one)
5. Define a constructor which takes all arguments and assigns those values to 
the instance variables and write “I am in parameterized constructor”
6. In main, to create another object of the Account class using the constructor 
with all arguments and print the instance variable values.
7. In main method, create 2 Account objects with different account numbers 
and names and print the values of all the member variables of both the 
accounts.
8. From Account class, comment the default constructor with no arguments 
and try to create an Account object by calling the default constructor (Note 
– If any single constructor is present in the source code, Java will not 
provide a default)

 */
package AssignmentNo4;

public class Account
{
long accountNo;
String customerName;
String comment;
Account()
{ 
	accountNo=1232423;
	customerName="mr.bajaj";
System.out.println("I am default constructor");
}
Account(long accNo,String cName)
{	
	accountNo=accNo;
	customerName =cName;
	System.out.println("I am parameterized constructor");
}
/*BankAccount()
{
	System.out.println("If any single constructor is present in the source code, Java will not provide a default");
}*/
}
