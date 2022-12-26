package AssignmentContainment;

public class Topic1 {
	private int tid;
	private String tname;
	SubTopic1 st1;
	Topic1(int tid,String tname,SubTopic1 st1)
	{
		this.tid=tid;
		this.tname=tname;
		this.st1=st1;
	}
	public String toString()
	{
		return "Topic Id:"+tid+"\nTopic name:"+tname+"\n"+st1;
	}
}
