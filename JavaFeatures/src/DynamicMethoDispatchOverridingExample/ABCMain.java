package DynamicMethoDispatchOverridingExample;

public class ABCMain {
	public static void main( String args[]) {
		
		ABC obj = new ABC();
		obj.disp();

		
		ABC obj2= new Demo();
		obj2.disp();
		//obj2.newMethod();

	   }
}
