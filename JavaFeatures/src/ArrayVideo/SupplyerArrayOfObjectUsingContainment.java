package ArrayVideo;

import java.util.Arrays;

	class Supplyer
	{
		int sid;
		String sname,smob;
		Item items[];
		public String toString()
		{
			return "\nid:"+sid+"\nname:"+sname+"\nmobile number:"+smob+"\nSupplied item:"+Arrays.toString(items);
		}
		
		Supplyer(){}
		
		Supplyer(int sid,String sname,String smob,Item[] items)		
		{
		this.sid=sid;
		this.sname=sname;
		this.smob=smob;
		this.items=items;
		}
	}	
	
	
	public class SupplyerArrayOfObjectUsingContainment 
	{
    public static void main(String[] args)
    {
    	Supplyer s[];
	s=new Supplyer[3];
	
	Item [] itms=new Item[2];
	itms[0]=new Item(1,"soup");
	itms[1]=new Item(2,"detergent");
	s[0]=new Supplyer(101,"rajesh","9878965430",itms);
	
	Item [] itms1=new Item[3];
	itms1[0]=new Item(10,"kurkure");
	itms1[1]=new Item(11,"chips");
	itms1[2]=new Item(12,"pencil");
	s[1]=new Supplyer(2,"satish","879654321",itms1);
	
	Item [] itms2=new Item[4];
	itms2[0]=new Item(21,"finel");
	itms2[1]=new Item(22,"pounds powder");
	itms2[2]=new Item(23,"biscuit");
	itms2[3]=new Item(24,"dal");
	s[2]=new Supplyer(3,"raj","90876543210",itms2);

	
	for(Supplyer sup:s)
	{
		for(Item i:sup.items)
		{	
				System.out.println(i);	
		}
	}
    }
    }
