package ArrayObject;

public class Person {
int id;
String name,address;
IDProof ip[];
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public IDProof[] getIp() {
	return ip;
}
public void setIp(IDProof[] ip) {
	this.ip = ip;
}
public String toString()
{
	return "\nid:"+id+"\nName:"+name+"\nAdrress:"+address+"\nIDProof:"+ip+"\n";
}
}
