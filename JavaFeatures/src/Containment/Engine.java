package Containment;

public class Engine {
 
 int cylinder,torque;
	String company,power;
	/*Engine(int cylinder,int torque,String company,String power)
	{
		this.cylinder=cylinder;
		this.torque=torque;
		this.company= company;
		this.power= power;
	}*/
	
	public int getCylinder() {
		return cylinder;
	}
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	public int getTorque() {
		return torque;
	}
	public void setTorque(int torque) {
		this.torque = torque;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String toString()
	{
		return "Cylinder:"+cylinder+"\nTorque:"+torque+"\nCompany:"+company+"\nPower:"+power;
	}

}