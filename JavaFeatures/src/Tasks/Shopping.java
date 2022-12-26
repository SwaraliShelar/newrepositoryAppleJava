/*create shopping class which contain purchase item name,price of per item and quantity.
  create first method to accetDetail.
  create second method to calculate the bill .
  create third method to display shopping detail with bill.*/
package Tasks;

import java.util.Scanner;

public class Shopping {
String name;
int price;
int quan;
int bill;

void acceptDetails(String pur_name1,int price1,int quan1 )
{
	 name= pur_name1;
	 price= price1;
	 quan=quan1;
}
void calculateBill()
{ 
	bill=quan*price;
}
void displayshopping()
{
	if(quan>0)
	{
	System.out.println("item name:"+name+" "+"\nitem price:"+price+" "+"\nitem quantity:"+quan+" "+"\ntotal price:"+bill);
	}
	else
	{
	System.out.println("error,please purchase some item");
	}
}
public static void main(String[] args) {
	Shopping sp=new Shopping();
	sp.acceptDetails("kurti",200,3);
	sp.calculateBill();
	sp.displayshopping();
}
}
