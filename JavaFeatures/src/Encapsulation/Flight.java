package Encapsulation;

public class Flight {
private int id;
private String company,source,destination,clas;
private int ticketrate;

public void setId(int id)
{
	this.id=id;
}
public int getId()
{
	return id;
}
public void setCompony(String company)
{
	this.company=company;
}
public String getCompany()
{
	return company;
}
public void setSource(String source)
{
	this.source=source;
}
public String getSource()
{
	return source;
}
public void setDestination(String destination)
{
	this.destination=destination;
}
public String getDestination()
{
	return destination;
}
public void setClas(String clas)
{
	this.clas=clas;
}
public String getClas()
{
	return clas;
	
}
public void setTicketrate(int ticketrate)
{
	this.ticketrate=ticketrate;
}
public int getTicketrate()
{
	return ticketrate;
}

/*public void setTicketrate(String ticketrate)
{
	if(ticketrate.equalsIgnoreCase("first class"))
	{
		System.out.println("flight is booked successfully.\nwith first class\nrate=50000");
	}
	else if(ticketrate.equalsIgnoreCase("bussiness class"))
	{
		System.out.println("flight is booked successfully.\nwith bussiness class\n rate=35000;");
	}
	else
	{
		System.out.println("flight is booked successfully.\nwith Economiee class\nrate=25000;");
	}
}*/

void display()
{
	System.out.println(id+"\n"+company+"\n"+source+"\n"+destination+"\n"+clas+"\n"+ticketrate);
}
}
