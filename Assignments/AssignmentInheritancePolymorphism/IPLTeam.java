package AssignmentInheritancePolymorphism;

public class IPLTeam {
	String teamname;
	int playernumbers;
	static String country="India";
	static int Over=20;
	static int umpire=2;
	static String stadium="Shivray statium";
	
	public void setTeamname(String teamname) 
	{
		this.teamname = teamname;
	}
	
	public void setPlayernumbers(int playernumbers)
	{
		this.playernumbers = playernumbers;
	}
public static void changeStadiumname(String stadiumname)
{
	stadium=stadiumname;
}
void display()
{
	System.out.println("\nTeam name:"+teamname+"\nNumber of players:"+playernumbers+"\nCountry name:"+country+"\nOvers:"+Over+"\nUmpire:"+umpire+"\nstadium name:"+stadium);
}
}
