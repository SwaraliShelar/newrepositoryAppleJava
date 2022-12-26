package AssignmentNo5;

public class PerJobJoingDateMain {
	public static void main(String[] args) {

		Joiningdate jd1 = new Joiningdate();
		jd1.setDay("tuesday");
		jd1.setMonth(10);
		jd1.setYear(2022);
		
		Job j1 = new Job();
		j1.setJobid(101);
		j1.setProfile(" software tester");
		j1.setJoinging(23);
		j1.setJoiningdate(jd1);

		Person p1 = new Person();
		p1.setId(1);
		p1.setName("swarali shelar");
		p1.setJob(j1);
		
		
		
		System.out.println("Inforamation about person joining details at work:");
	   System.out.println("Id:"+p1.getId()+"\nName:"+p1.getName()+"\n"+j1);

	   // System.out.println(p1.getJob()+"\n"+j1.getJoiningdate());
	
	}
}