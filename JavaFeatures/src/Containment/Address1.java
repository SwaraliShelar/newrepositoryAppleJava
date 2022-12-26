package Containment;

public class Address1 {
private String area,city,state,pincode;

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String toString()
{
	return "Area:"+area+"\nCity:"+city+"\nState:"+state+"\nPincode:"+pincode;
}
}
