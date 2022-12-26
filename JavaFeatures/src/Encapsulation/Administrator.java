package Encapsulation;

public class Administrator
{
public void authorization(String user,Authentication au)
{
	String newu=au.getUsername();
	au.setUsername(newu);
	int newp=au.getPassword();
	au.setPassword(newp);
	System.out.println(" username:"+au.getUsername()
	+"\n password:"+au.getPassword());
}
public static void main(String[] args) {

Authentication obj=new Authentication();
obj.acceptDetails("swara", 123);
Administrator ad=new Administrator();
ad.authorization("swara",obj);
}
}