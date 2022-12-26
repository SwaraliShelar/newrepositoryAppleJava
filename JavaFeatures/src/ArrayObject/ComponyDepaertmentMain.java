package ArrayObject;

import java.util.Scanner;

public class ComponyDepaertmentMain
{

	public static void main(String[] args)
	{
    Scanner sc= new Scanner(System.in);
    //System.out.println("hoe many time you want to enter compony details??");
   // int size=sc.nextInt();
  // Company com[]=new Company[size];//size =2
    Company com[]=new Company[1];//size =2
    for(int i=0;i<com.length;i++)
    {
        Department dept[]=new Department[2];//size//it should be inside a company for loop
        System.out.println("enter Compony id:");
        int cid=sc.nextInt();
        System.out.println("enter Compony name:");
        String cname=sc.next();
        System.out.println("enter Department information:");
    	for(int j=0;j<dept.length;j++)
    	{
    		System.out.println("Enter Department id,numbers of employee,department name:");
    		int did=sc.nextInt();
    		int dpno=sc.nextInt();
    		String dname=sc.next();
    		dept[j]=new Department(did,dpno,dname);
    	}
    	 com[i]=new Company(cid,cname,dept);
    }
	
    for(Company c:com)
    {
    	System.out.println(c);
    }
}
}