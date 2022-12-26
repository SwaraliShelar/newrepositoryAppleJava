package ClassObjectHomeVideo;

public class Accountstatic {
int accno;
String name;
float balance;
static String  bankname="ICIC";//you can change a static value of variable by using static method 
static float interest=7.6f;

Accountstatic(){}//default constructor

Accountstatic(int a,String nme,float bl)//parameterized constructor
{
	accno=a;
	name=nme;
	balance=bl;
}

//static method can only access static variable
static void changebankname(String newbnknme)//static method 
{
	
	//balance=20000.70f;//error
	//non static variable cannot accessible within static method
	bankname=newbnknme;
}
//non static method can access both static or non static variable
void showDetails()//non static method 
{ 
	System.out.println("account number:"+accno+" "+"with bankname "+bankname);
	System.out.println("name: "+name);
	System.out.println("balance:"+balance);
	System.out.println("Interest rate applicable:"+interest);
}
public static void main(String[] args) {
	Accountstatic as1=new Accountstatic(1231,"pooja",2000.54f);
	Accountstatic as2=new Accountstatic(5678,"rutu",3000.20f);
	/*as1.showDetails();
	as2.showDetails();
	it will show these value:-
	account number:1231 with bankname ICIC
    name: pooja
    balance:2000.54
    Interest rate applicable:7.6
    account number:5678 with bankname ICIC
    name: rutu
    balance:3000.2
    Interest rate applicable:7.6
*/
	Accountstatic.changebankname("IDBI");
	as1.showDetails();
	System.out.println();
	as2.showDetails();
}
}
