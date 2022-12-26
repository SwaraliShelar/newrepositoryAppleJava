package AssignmentContainment;

public class Address1 {
	private String city, state, country;

	Address1(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
	public String toString()
	{
		return "City:"+city+"\nState:"+state+"\nCountry:"+country;
	}
}
