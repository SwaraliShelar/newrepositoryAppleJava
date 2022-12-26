package Overriding;
//
public class IPLTeam {

String crickername;
int overs,runs;
static String stadiumname="vankhede stadium";

	void Play(String crickername,int overs,int runs,String stadiumname)
	{
		this.crickername=crickername;
		this.overs=overs;
		this.runs=runs;
		this.stadiumname=stadiumname;		
	}
	void display()
	{
		System.out.println("crickername:"+crickername+" "+"Overs:"+overs+" "+"Runs:"+runs+" "+"stadium Name:"+stadiumname);
	}
	
	
}
