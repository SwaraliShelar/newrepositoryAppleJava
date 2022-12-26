package Encapsulation;

public class Authentication {
private String username;
private int password;
public void setUsername(String uname)
{
	username=uname;
}
public String getUsername()
{
	return username;
}
public void setPassword(int pword)
{
	password=pword;
}
public int getPassword()
{
	return password;
}
public void acceptDetails(String u,int p)
{
	username=u;
	password=p;
}
}
