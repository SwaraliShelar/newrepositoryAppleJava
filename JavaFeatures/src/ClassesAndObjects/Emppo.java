package ClassesAndObjects;

import java.util.Scanner;

public class Emppo {
	int id,salary;
	String name,dept;
	char rate;
	float bonus, pfsalary;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee Id:");
		id =sc.nextInt();
		System.out.println("Enter the employee name:");
		name =sc.next();
		System.out.println("Enter the employee Salary:");
		salary =sc.nextInt();
		System.out.println("Enter the employee department:");
		dept =sc.next();
		System.out.println("Enter the employee rate between (A/B/C/D):");
		rate =sc.next().charAt(0);
        
		
	 }
     void bonus()
     {
    	// float bonus;
    	 if( rate == 'A')
    	 {
    	     bonus = salary*0.15f;
    	   //  System.out.println("Bonus is: "+bonus);
         }
    	 else if( rate == 'B')
    	 {
    	     bonus = salary*0.10f;
    	  //   System.out.println("Bonus is: "+bonus);
         }
    	 else if( rate == 'C')
    	 {
    	     bonus = salary*0.05f;
    	    // System.out.println("Bonus is: "+bonus);
         }
    	 else
    	 {
    		 bonus = salary*0.0f;
    	    // System.out.println("Bonus is: "+bonus);
    	 }
    	   // return bonus;
      } 
        void pfcalculate()
    	 {
    		pfsalary = salary* 0.10f;
    		//System.out.println("Pf :"+pfsalary);
    	    //	return pfsalary;
    	 }

        void display()
        {
        	System.out.println("Name:"+name);
        	System.out.println("Salary : "+salary);
        	System.out.println("Bonus is: "+bonus);
        	System.out.println("Pf :"+pfsalary);
        }

	public static void main(String[] args) {

		Emppo e = new Emppo();
		e.input();
		e.bonus();
		e.pfcalculate();
		e.display();
		
		//float bonus =e.bonus();
		//float pfsalary =e.pfcalculate();
     
	}

}

