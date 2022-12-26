package Containment;

public class Driver11 {
	private int did,contact ;
	private String dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String toString()
	{
		return "Driver Id:"+did+"\nDriver Contact:"+contact+"\nDriver name:"+dname;
	}
}
