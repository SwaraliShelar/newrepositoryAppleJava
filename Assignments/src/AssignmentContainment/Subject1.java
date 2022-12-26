package AssignmentContainment;

public class Subject1 {
	private int sid;
	private String sname;
	Topic1 t1;
	Subject1(int sid,String sname,Topic1 t1)
	{
		this.sid=sid;
		this.sname=sname;
		this.t1=t1;
	}
	public String toString()
	{
		return "Subject id:"+sid+"\nSubject Name:"+sname+"\n"+t1;
	}
}
