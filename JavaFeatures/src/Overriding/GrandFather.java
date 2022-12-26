package Overriding;

public class GrandFather {
	String firstn,middlen;
	static String lastn="Shelar";


	public void setFirstn(String firstn) {
		this.firstn = firstn;
	}

	public void setMiddled(String middlen) {
		this.middlen = middlen;
	}
	/*public void setLastn(String lastn)
	{
		GrandFather.lastn=lastn;
	}*/
	void display()
	{
		System.out.println("GrandFathrs full name:"+firstn+" "+middlen+" "+GrandFather.lastn);
	}
}
