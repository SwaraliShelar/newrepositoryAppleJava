package ArrayObject;

import java.util.Scanner;

import Containment.IdProof2;
import Containment.IdProof3;

public class IDProofPersonMain
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
        
		Person per[]=new Person[1];//2 person
    for(int i=0;i<per.length;i++)
    {
        IDProof id[]=new IDProof[3];//at least 3 id proof per person
    	System.out.println("enter person details id name,address :");
    	int pid=sc.nextInt();
    	String pname=sc.next();
    	String padd=sc.next();
       
    for(int j=0;j<id.length;j++)
    {
    	System.out.println("enter idproofName,validity :");
    	
    	IDProof d=new IDProof();//object

    	String ipn=sc.next();
    	String val=sc.next();
    	d.setName(ipn);
    	d.setValidity(val);
    	id[j]=d;    	
    }
    Person p=new Person();//object 
	p.setId(pid);
	p.setName(pname);
	p.setAddress(padd);
    p.setIp(id);
    per[i]=p;
    }    
   for(Person p:per)
   {
	   for(IDProof d:p.ip)
	   {
		   if(d.getName().equalsIgnoreCase("pancard"))
		   {
			   System.out.println(p.getName()+" "+p.getAddress()+" "+d.getName());
		   }   
	   }
   }
}   
}

