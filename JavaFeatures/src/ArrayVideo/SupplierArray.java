package ArrayVideo;

import java.util.Arrays;

class Supplier
{
	int sid;
	String sname,smob;
	
	public String toString()
	{
		return "\nid:"+sid+"\nname:"+sname+"\nmobile number:"+smob;
	}
	
	Supplier(){}
	
	Supplier(int sid,String sname,String smob)		
	{
	this.sid=sid;
	this.sname=sname;
	this.smob=smob;
	}
}	
public class SupplierArray
{
public static void main(String[] args)
{
	//Supplier s[];
    //s=new Supplier[5];
	Supplier s[]=new Supplier[5];
	
    s[0]=new Supplier(1,"rakesh","9876543210");
    s[1]=new Supplier(2,"sunil","89765432106");
    s[2]=new Supplier(3,"ketan","9876543210");
    s[3]=new Supplier(4,"umesh","89765432106");
    s[4]=new Supplier(5,"raj","9876543210");
    
    System.out.println("Supplier records:");
    
   /* for(int i=0;i<s.length;i++)
    {
    	System.out.println(s[i]);
    }*/
    
   /* for(Supplier obj:s)
    {
    	System.out.println(obj);
    }*/
    System.out.println(Arrays.toString(s));
}
}

