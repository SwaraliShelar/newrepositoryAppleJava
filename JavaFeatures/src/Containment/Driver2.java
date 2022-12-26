package Containment;

public class Driver2 {
	private int did,contact ;
	private String dname;
	Driver2( int did,int contact,String dname)
	{
		this.did=did;
		this.contact=contact;
		this.dname=dname;
	}
	public String toString()
	{
		return "Driver id:"+did+"\nDriver contact number:"+contact+"\nDriver name:"+dname;
	}
}
