package Retunexample;

import java.util.Scanner;

public class Caruseretur {

String name;
int speed;
String colour;
int price;
String mop;
float discount;

Scanner sc=new Scanner(System.in);
void setdata()
{
	System.out.println("enter car details:"+"\n"+"name"+" "+"speed"+" "+"colour"+" "+"price"+" "+"mod of payment(online/offline)");
	name=sc.next();
	speed=sc.nextInt();
	colour=sc.next();
	price=sc.nextInt();
    mop=sc.next();
}
float dcount()
{
	if(mop.equalsIgnoreCase("online"))
	{
		discount=price*0.05f;
		System.out.println("price before adding discount:"+price);
		System.out.println("discount:"+discount);
		System.out.println("new price after adding discount:"+(price-discount));
	}
	return discount;
}
 public String toString()
{
	return"car Details:"+"\n"+name+"\n"+(price-discount)+"\n"+colour;
}
public static void main(String[] args) {
	Caruseretur cg=new Caruseretur();
	cg.setdata();
	cg.dcount();
	System.out.println(cg);
}
}


