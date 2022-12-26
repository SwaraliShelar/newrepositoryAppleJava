package AssignmentContainment;

public class Question {
	private String qid;
	private String qname;
	
	public String getQid() {
		return qid;
	}
	public void setQid(String qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public String toString()
	{
		return "Question id:"+qid+"\nQuestion name:"+qname;
	}
}
