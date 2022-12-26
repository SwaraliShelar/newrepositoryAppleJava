package WrittenTest8;

public class IPLTeamMain {

	public static void main(String[] args) 
	{
    RCB r= new RCB();
    r.setId(1);
    r.setNameOfTeam("RCB");
    r.setNoOfPlayers(11);
    r.play();
    RCB.changeStadiummName("Vankhede stadium");
    System.out.println("ID:"+r.getId()+"\nIPL team name: "+r.getNameOfTeam()+"\n"+r.noOfPlayers+" Players in team"+"\n"+IPLTeam.over+" overs match"+"\nStadium name:"+IPLTeam.stadiumName);
    
    CSK c= new CSK();
    c.setId(2);
    c.setNameOfTeam("CSK");
    c.setNoOfPlayers(12);
    c.play();
    CSK.changeStadiummName("Vankhede stadium");
    System.out.println("ID:"+r.getId()+"\nIPL team name: "+r.getNameOfTeam()+"\n"+r.noOfPlayers+" Players in team"+"\n"+IPLTeam.over+" overs match"+"\nStadium name:"+IPLTeam.stadiumName);

	}
}
