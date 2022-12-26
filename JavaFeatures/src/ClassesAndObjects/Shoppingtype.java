
package ClassesAndObjects;

import java.util.Scanner;

public class Shoppingtype {
String name;
String type;
int quantity;
int price;
String moe;
float discount;
float bill;

Scanner sc=new Scanner(System.in);
void setdata()
{
	System.out.println("enter product details:"+"\n"+"name"+" "+"type"+" "+"quantity"+" "+"price"+" "+"mod of payment(online/offline)");
	name=sc.next();
	type=sc.next();
	quantity=sc.nextInt();
	price=sc.nextInt();
	moe=sc.next();
}
void display()
{
	if(quantity>0)
	{
	if(moe.equalsIgnoreCase("online"))
	  {
		bill=quantity*price;
		discount=price*0.05f;
		System.out.println("product name:"+name+" "+"\nproduct type:"+type+" "+"\nproduct quantity:"+quantity+"\n"+"price:"+price);
		System.out.println("bill:"+bill);
		System.out.println("discount:"+discount);
		System.out.println("final bill:"+(price-discount));
      }
	}
	else
	{
		System.out.println("error,please enter valid quantity");
	}
}

public static void main(String[] args) {
	Shoppingtype sp=new Shoppingtype();
	sp.setdata();
	sp.display();
}
}


