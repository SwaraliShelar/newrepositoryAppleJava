package AssignmentContainment;

public class Topic {
	private int tid;
	private String tname;
	SubTopic st;
	public void setSubTopic(SubTopic st)
	  {
		  this.st=st;
	  }
	  public SubTopic getSubTopic()
	  {
		  return st;
	  }
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String toString()
	{
		return "Topic Id:"+tid+"\nTopic name:"+tname+"\n"+st;
	}
}
