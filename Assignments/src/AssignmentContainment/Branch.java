package AssignmentContainment;

public class Branch {
	private int bid;
	private String bname;
	Subject s;
	public void setSubject(Subject s)
    {
    	this.s=s;
    }
    public Subject getSubject()
    {
    	return s;
    }
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String toString()
	{
		return "Branch id:"+bid+"\nBranch Name:"+bname+"\n"+s;
	}
}
