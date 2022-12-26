package Containment;

public class IdProof3 {
	private String number ,name,address;
	IdProof3( String number ,String name,String address)
	{
		this.number=number;
		this.name=name;
		this.address=address;
	}
	public String toString()
	{
		return "Number:"+number+"\nName:"+name+"\nAddress:"+address;
	}
}
