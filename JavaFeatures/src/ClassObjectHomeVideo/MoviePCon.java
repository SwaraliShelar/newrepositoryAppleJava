package ClassObjectHomeVideo;

public class MoviePCon {
	float profit;
	String producerName,actorName;
	int yearOfRelease;
	 //using parameter
	MoviePCon()
	{
		 profit=1200000.00f;
		 producerName="mr james";
	     actorName="leonardo";
		yearOfRelease=1997;
	}
	MoviePCon(float p,String pn,String an,int yr)
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
        System.out.println("movie release in year of :"+yearOfRelease);
	}
	public static void main(String[] args) {
		MoviePCon titanic=new MoviePCon();
		System.out.println("titanic object created and values initialised in object");
		titanic.showDetails();
		System.out.println();
		MoviePCon uri=new MoviePCon(150000.00f,"v.chopra","viki kaushal",2019);
		System.out.println("uri object created and values initialised in object");
		uri.showDetails();
		
	}
}


