package AssignmentInheritancePolymorphism;

public class CSK extends IPLTeam
{
	String ownername;
	
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	void display()
	{
		super.display();
		System.out.println("Team owner name:"+ownername);
	}
}
