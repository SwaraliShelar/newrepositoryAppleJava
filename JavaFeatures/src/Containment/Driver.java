package Containment;

public class Driver {
	private int did,contact ;
	private String dname;
	Driver(int did,int contact,String dname)
	{
		this.did=did;
		this.contact=contact;
		this.dname=dname;
	}
	public String toString()
	{
		return "Driver id:"+did+"\nDriver contact:"+contact+"\nDriver name:"+dname;
	}
}
