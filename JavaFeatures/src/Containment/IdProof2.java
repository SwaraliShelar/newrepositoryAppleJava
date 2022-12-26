package Containment;

public class IdProof2 {
private String number ,name,address;

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
public String toString()
{
	return "Number:"+number+"\nName:"+name+"\nAddress:"+address;
}
}
