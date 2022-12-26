package WrittenTest8;
/*Create class IPLTeam with method play. 
* Create child classes of IPLTeam called as CSK, RCB. In main, call play from child class objects.
hierarchical inheritance
*/public class IPLTeam
{
int id;
String nameOfTeam;
int noOfPlayers;
static int over=20;
static String stadiumName="Shivaji maharaj stadium";
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNameOfTeam() {
	return nameOfTeam;
}
public void setNameOfTeam(String nameOfTeam) {
	this.nameOfTeam = nameOfTeam;
}
public int getNoOfPlayers() {
	return noOfPlayers;
}
public void setNoOfPlayers(int noOfPlayers) {
	this.noOfPlayers = noOfPlayers;
}
public String getStadiumName()
{
	return stadiumName;
}
public int getOver()
{
	return over;
}
void play()
{
	System.out.println("\nIn IPLTeam in IPL there are multiple teams who plays Cricket");
}
public static void changeStadiummName(String name)
{
	stadiumName=name;
}
}
class CSK extends IPLTeam
{
	public void play()
	{
		super.play();
		System.out.println("CSK is the team that also plays a cricket ");
	}
}

class RCB extends IPLTeam
{
	public void play()
	{
		super.play();
		System.out.println("RCB is the team that also plays a cricket");
	}
}
