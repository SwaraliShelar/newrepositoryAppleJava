package ClassesAndObjects;

import java.util.Scanner;

public class CarGlobal {
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
void discount()
{
	if(mop.equalsIgnoreCase("online"))
	{
		discount=price*0.05f;
		System.out.println("price before adding discount:"+price);
		System.out.println("discount:"+discount);
		System.out.println("new price after adding discount:"+(price-discount));
	}
}
void display()
{
	System.out.println("car Details:"+"\n"+name+"\n "+colour+"\n "+(price-discount));
}
public static void main(String[] args) {
	CarGlobal cg=new CarGlobal();
	cg.setdata();
	cg.discount();
	cg.display();
}
}
