package ClassObjectHomeVideo;

public class Movie {

	float profit;
	String producerName,actorName;
	int yearOfRelease;
	 //using parameter
	void acceptDetails(float p,String pn,String an,int yr)
	{
		profit=p;
		producerName=pn;
		actorName=an;
		yearOfRelease=yr;
	}
	void showDetails()
	{
		System.out.println("Movie profit in rs."+profit);
		System.out.println("Movie producer name:"+producerName);
		System.out.println("Movie actor name:"+actorName);
        System.out.println("movie release in year of"+yearOfRelease);
	}
	public static void main(String[] args) {
		Movie titanic=new Movie();
		Movie uri=new Movie();
		
		titanic.showDetails();
		System.out.println("after calling accetDetails and states in titanic object");
		titanic.acceptDetails(120000.00f,"me.james","leonardo",1997);
		titanic.showDetails();
		
		titanic.showDetails();
		titanic.acceptDetails(150000.00f,"v.chopra","viki kaushal",2019);
		System.out.println("details from uri object");
		titanic.showDetails();
		
	}
}
