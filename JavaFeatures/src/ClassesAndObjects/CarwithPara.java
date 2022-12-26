package ClassesAndObjects;

import java.util.Scanner;

public class CarwithPara {
	int price ,speed;
	String colour,name, modp;

	void setData(int p,int s,String c,String n,String m)
	{
		price=p;
		speed=s;
		colour=c;
		name=n;
		modp=m;
	     
	}
	void discount()
	{
		float discount;
		System.out.println("mode of payment:"+modp);
		if(modp.equalsIgnoreCase("Online"))
		{
			discount=price*0.05f;
			System.out.println("Discount is:"+discount);
			System.out.println("new price is:"+(price-discount));
		}
	}
	void display()
	{
		System.out.println("car Details:"+price+"\n "+colour+"\n "+name);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter a price,speed,colour,name,and mode of paymet(Online or offine):");
		int  p=sc.nextInt();
		int s=sc.nextInt();
		String c=sc.next();
		String n=sc.next();
		String m=sc.next();
	    
     CarwithPara c1=new CarwithPara();
     c1.setData(p,s,c,n,m);
     c1.display();
     c1.discount();

}
}
