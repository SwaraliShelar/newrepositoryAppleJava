package ClassesAndObjects;
import java.util.Scanner;

public class Empret {

		int id;
		String name, dept;
		int salary;
		long contno;
		char rate;
		float bonus;

		void EmpDetails() {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter employee details:\nid,name,dept,contno,salary and rating(a/b/c/d)");
			id = sc.nextInt();
			name = sc.next();
			dept = sc.next();
			contno = sc.nextLong();
			salary = sc.nextInt();
			rate = sc.next().charAt(0);
		}

		float bonus() {
			System.out.println("original salary:" + salary);
			if (rate == 'a')
			{
				bonus = salary * 0.20f;
			}
			else if (rate == 'b')
			{
				bonus = salary * 0.15f;
			}
			else if (rate == 'c')
			{
				bonus = salary * 0.10f;
			}
			else
			{
				bonus = salary;
			}
			System.out.println("salary after adding bonus:" + bonus);
			return bonus;
		}

		float pfcalculate(float bonus)
		{
			float pf;
			pf= salary * 0.15f;
	        return pf;
	    }
        void display(float bonus,float pf)
        {
        	System.out.println(" id:" + id + "\n" + "name:" + name + "\n" + "salary:"+salary+"\n"+"bonus:"+bonus+"\n"+"pfsalary:"+pf);
        }
		

		public static void main(String[] args) {
		 Empret ewp = new  Empret();
			ewp.EmpDetails();
			float tobonus = ewp.bonus();
			ewp.pfcalculate(tobonus);
            ewp.display(tobonus, tobonus);
		}
	}


