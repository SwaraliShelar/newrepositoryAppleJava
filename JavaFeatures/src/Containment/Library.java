package Containment;

public class Library {
private int noOfbooks;
private String incharge;
public int getNoOfbooks() {
	return noOfbooks;
}
public void setNoOfbooks(int noOfbooks) {
	this.noOfbooks = noOfbooks;
}
public String getIncharge() {
	return incharge;
}
public void setIncharge(String incharge) {
	this.incharge = incharge;
}
public String toString()
{
	return "\nLibrary Number of books:"+noOfbooks+"\nLibrary incharge:"+incharge;
}
}
