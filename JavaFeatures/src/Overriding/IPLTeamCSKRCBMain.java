package Overriding;

public class IPLTeamCSKRCBMain
{
public static void main(String[] args) {
	CSK c=new CSK();
	c.Play(11,5);
	c.Play("sachin tendulkar",20,400,CSK.stadiumname);
	c.display();
	
	RCB r=new RCB();
	r.Play(11,7);
	r.Play("rahul dravid",20,300,RCB.stadiumname);
	r.display();
}
}
