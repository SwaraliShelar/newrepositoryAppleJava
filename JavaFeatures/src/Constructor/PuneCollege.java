package Constructor;


	public class PuneCollege {
		
		int id,dno,studno;
		String name,location;
		static String uniname ="Pune university";
		static String state = "Maharashtra";
		
	 void setdata()
	 {
		 System.out.println(state + " "+id);
	 }
	 static void setvariables()
	 {
		 uniname = "Shivaji University";
		 System.out.println("Inside static method");
		 System.out.println(uniname);
		 PuneCollege pc = new PuneCollege();
		 pc.id=1;
		 System.out.println(pc.id);
	 }
		
	public static void main(String[] args) {
        
		PuneCollege p = new PuneCollege();
		p.setdata();
		PuneCollege.setvariables();
		
	}

}

