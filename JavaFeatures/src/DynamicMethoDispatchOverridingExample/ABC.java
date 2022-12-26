package DynamicMethoDispatchOverridingExample;

public class ABC {
	
		   //Overridden method
		   public void disp()
		   {
			System.out.println("display method of parent class");
		   }
		  
		}
		class Demo extends ABC{
		   //Overriding method
		   public void disp()
		   {
			   super.disp();
			System.out.println("display method of Child class");
		   }
		 /*  public void newMethod(){
			System.out.println("new method of child class");
		   }*/
		   
		
}
