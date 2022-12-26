package AssignmentInheritancePolymorphism;

public class PersonPrgramerDancerSingerMainHierarchical {
	public static void main(String[] args)
	{
		ProgrammerProfile pp=new ProgrammerProfile();
		pp.acceptDetails("swarali shelar", "9876543210","programmer");
		pp.coding("Infosys");
		pp.display();
		
		DancerProfile dp=new DancerProfile();
		dp.acceptDetails("shraddha patil","9807678909","Dancer");
		dp.dancing("hip-hop");
		dp.display();
		
		 SingerProfile sp=new SingerProfile();
		 sp.acceptDetails("Uday shelar","9087678909","Singer");
		 sp.Singing("bollywood");
		 sp.PlayGitar();
		 sp.bandname("ajay atul music company");
		 sp.display();
     }
}