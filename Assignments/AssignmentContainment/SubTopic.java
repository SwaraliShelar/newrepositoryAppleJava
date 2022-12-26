package AssignmentContainment;

public class SubTopic {
	private int stid;
	private String stname;
	Question q;
	 public void setQuestion(Question q)
	    {
	    	this.q=q;
	    }
	    public Question getQuestion()
	    {
	    	return q;
	    }
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String toString()
	{
		return "SubTopic id:"+stid+"\nSubTopic  name:"+stname+"\n"+q;
	}
}
