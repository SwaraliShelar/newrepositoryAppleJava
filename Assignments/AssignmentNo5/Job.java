package AssignmentNo5;

public class Job {
	int jobid;
	String profile; 
	int joinging ;
	public int getJoinging() {
		return joinging;
	}
	public void setJoinging(int joinging) {
		this.joinging = joinging;
	}
	Joiningdate jd;
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Joiningdate getJoiningdate() {
		return jd;
	}
	public void setJoiningdate(Joiningdate jd) {
		this.jd = jd;
	}
	public String toString()
	{
		return "Job Id:"+jobid+"\nProfile:"+profile+"\nJoiningDate:"+joinging+jd;
	}
}
