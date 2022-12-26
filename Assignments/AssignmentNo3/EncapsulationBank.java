/*9.Give the real time example of encapsulation with code.
Suppose you have an account in the bank.
If your balance variable is declared as a public variable in the bank software, your account balance will be known as public, In this case, anyone can know your account balance. 
So, would you like it? Obviously No.
So, they declare balance variable as private for making your account safe, so that anyone cannot see your account balance.
The person who has to see his account balance, will have to access only private members through methods defined inside that class and this method will ask your account holder name or user Id, and password for authentication.
Thus, we can achieve security by utilizing the concept of data hiding. This is called Encapsulation in Java.
 */
package AssignmentNo3;

public class EncapsulationBank
{
private float balance;
//account holder name or user Id, and password for authentication
private String name;
private String userId,password;

public void setBalance(float balance)
{
	this.balance=balance;
}
public float getBalance()
{
	return balance;
}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setUserId(String userId)
{
	this.userId=userId;
}
public String getUserId()
{
	return userId;
}
public void setPassword(String password)
{
	this.password=password;
}
public String getPassword()
{
	return password;
}
}
