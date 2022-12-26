package ClassObjectHomeVideo;

public class MovieNPCon 
{
	float profit;
	String producerName,actorName;
	int yearOfRelease;  
	
	/*	constructor :- is same name as a class name 
        Java, constructors can be divided into 3 types:
        1)    Non-Arguments Constructor(user defined default constructor)
        2)    Parameterized Constructor
        3)    Default Constructor
 we can create constructor to initialize values to instance variable instead of acceptDetails() 
    */
	MovieNPCon()//Non-Arguments Constructor(user defined default constructor)
	{
	     profit=1200000.00f;
		 producerName="mr james";
	     actorName="leonardo";
		 yearOfRelease=1997;
	}
	void showdetails()
	{
		System.out.println("Movie profit in rs."+profit);
		System.out.println("Movie producer name:"+producerName);
		System.out.println("Movie actor name:"+actorName);
        System.out.println("movie release in year of "+yearOfRelease);
        }
public static void main(String[] args) 
{
	MovieNPCon titanic=new MovieNPCon();
	System.out.println("After object creation value initialise in object");
	titanic.showdetails();
}
}
