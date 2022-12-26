package ArrayObject;

public class IDProof {
String name,validity;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getValidity() {
	return validity;
}

public void setValidity(String validity) {
	this.validity = validity;
}
public String toString()
{
	return "\nIDProof Name:"+name+"\nvalidity:"+validity;
}
}
