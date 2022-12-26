package ClassObjectHomeVideo;

public class Acco {
int acc;
String name;
float balance;
 

public void openBankAcco()
{
	fillBankDetails(123,"ravi",343.54f);
}
private void fillBankDetails(int acc1,String name1,float bal)
{
	acc=acc1;
	name=name1;
	balance=bal;
}
void acceptDetails()
{
	System.out.println("Account number:"+acc);
    System.out.println("Account holders name:"+name);
    System.out.println("Account balance:"+balance);
}
public static void main(String[] args) {
	Acco obj=new Acco();
	obj.openBankAcco();
	//obj.fillBankDetails(789,"pooja",232.09f);
	obj.acceptDetails();
}
}
