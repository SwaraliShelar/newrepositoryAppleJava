package AssignmentContainment;

public class SubTopic1 {
	private String stid;
	private String stname;
	Question1 q1;
	SubTopic1(String stid,String stname,Question1 q1)
	{
		this.stid=stid;
		this.stname=stname;
		this.q1=q1;
	}
	public String toString()
	{
		return "SubTopic id:"+stid+"\nSubTopic  name:"+stname+"\n"+q1;
	}
}
