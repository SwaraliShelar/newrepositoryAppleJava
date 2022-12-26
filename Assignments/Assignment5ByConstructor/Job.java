package Assignment5ByConstructor;

public class Job 
{
	int jobid;
	String profile;
	int joiningdate;
	Joiningdate jd;
	
Job(int jobid,String profile,int joiningdate,Joiningdate jd)
{
	this.jobid=jobid;
	this.profile=profile;
	this.joiningdate=joiningdate;
	this.jd=jd;
}
public String toString()
{
	return "Job Id:"+jobid+"\nProfile:"+profile+"\nJoiningDate:"+joiningdate+"\nJoiningdate:"+jd;
}
}
