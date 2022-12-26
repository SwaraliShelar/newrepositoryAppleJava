package Encapsulation;

public class Shopping {
private String name;
private int c_id;
private int balance;
private int password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public void setC_id(int c_id)
{
	this.c_id=c_id;
}
public int getC_id()
{
	return c_id;
}

}
