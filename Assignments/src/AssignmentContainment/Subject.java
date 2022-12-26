package AssignmentContainment;

public class Subject {
	private int sid;
	private String sname;
	Topic t;
	
	public void setTopic(Topic t)
    {
    	this.t=t;
    }
    public Topic getTopic()
    {
    	return t;
    }
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String toString()
	{
		return "Subject id:"+sid+"\nSubject Name:"+sname+"\n"+t;
	}
}
