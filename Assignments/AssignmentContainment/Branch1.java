package AssignmentContainment;

public class Branch1 {
	private int bid;
	private String bname;
	Subject1 s1;
	Branch1(int bid,String bname,Subject1 s1)
	{
		this.bid=bid;
		this.bname=bname;
		this.s1=s1;
	}
	public String toString()
	{
		return "Branch id:"+bid+"\nBranch Name:"+bname+"\n"+s1;
	}
}
