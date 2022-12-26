package CrudOperation;

public class EmployeeMain 
{
	Employee emp[]=new Employee[5];

	void insertData()
	{
	Employee e1=new Employee();
	e1.setId(1);
	e1.setName("swarali");
	e1.setDept("finance");
	e1.setSalary(30000);
	emp[0]=e1;
	
   Employee e2=new Employee();
   e2.setId(2);
   e2.setName("pooja");
   e2.setDept("marketing");
   e2.setSalary(40000);
   emp[1]=e2;
   
   Employee e3=new Employee();
   e3.setId(3);
   e3.setName("shweta");
   e3.setDept("advertisement");
   e3.setSalary(600000);
   emp[2]=e3;
   
   Employee e4=new Employee();
   e4.setId(4);
   e4.setName("rahul");
   e4.setDept("soft developer");
   e4.setSalary(70000);
   emp[3]=e4;
   
   Employee e5=new Employee();
   e5.setId(5);
   e5.setName("reshma");
   e5.setDept("economics");
   e5.setSalary(40000); 
   emp[4]=e5;
	}
	void viewData() 
	{
		System.out.println("All view Data");
		for (Employee e: emp) 
		{
			System.out.println(e);
			//System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary() + " " + e.getDept());
		}
		System.out.println();
	}
	//view details
	void viewSpecificData()
	{
		System.out.println("details of specific employee:");
		int id=2;
		for(Employee e:emp)
		{
			if(id==e.getId())
			{
				System.out.println(e);
				//System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());
			}
		}
		System.out.println();
	}
	//view update data
	void updateData()
	{
		System.out.println("display updated salary of employee");
		for(Employee e:emp)
		{
			int id=5;float salary=40000;
			float newsalary;
			
			if(id==e.getId() && salary==e.getSalary())
			{
				System.out.println("before updated salary:"+e.getSalary());
				float hike=salary*0.15f;
				newsalary=salary+hike;
				System.out.println("id:"+e.getId()+"  name:"+e.getName()+"   new salary:"+newsalary);
			}
		}
		System.out.println();
	}
	void DeleteData()
	{
		int id=3;
		System.out.println("after deletion of one record:");
		for(Employee e:emp)
		{
				if(id!=e.getId())
				{
					System.out.println(e);
					//System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());
				}
		}
	}
	public static void main(String[] args) 
	{
		EmployeeMain e=new EmployeeMain();
		e.insertData();
		e.viewData();
		e.viewSpecificData();
		e.updateData();
		e.DeleteData();
	}
}