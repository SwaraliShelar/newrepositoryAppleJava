package ClassObjectHomeVideo;

public class MovieDCon {
	float profit;
	String producerName,actorName;
	int yearOfRelease;  
// is example for default constructor
//java complier  automatically created default constructor during runtime
	void showDetails()
	{
		System.out.println("Movie profit in rs."+profit);
		System.out.println("Movie producer name:"+producerName);
		System.out.println("Movie actor name:"+actorName);
        System.out.println("movie release in year of "+yearOfRelease);
        }
public static void main(String[] args) 
{
	MovieDCon titanic=new MovieDCon();//constructor invoked(created) automatically at time of object creation
	System.out.println("After object creation value initialise in object \nwe use default consturctor thats why value is initialize as 0 or null");
	titanic.showDetails();
}
}

