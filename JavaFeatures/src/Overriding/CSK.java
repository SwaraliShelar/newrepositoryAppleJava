package Overriding;

public class CSK extends IPLTeam
{
	int noOfCricketers,bolling;
void Play(int noOfCricketers,int bolling)
{
	super.Play(crickername,overs,runs,stadiumname);
	this.noOfCricketers=noOfCricketers;
	this.bolling=bolling;
}
void display()
{
	super.display();
	System.out.println("NoOfCricketers :"+noOfCricketers+" "+"Bolling :"+bolling);
}
}
