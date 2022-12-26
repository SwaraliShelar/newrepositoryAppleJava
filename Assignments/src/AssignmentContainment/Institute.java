/*2.WAP to use containment for following hierarchy. Fill all data and print all 
data: (id is a integer number, name is a String)
 */
package AssignmentContainment;

public class Institute {

	private int iid;
	private String iname;
	Branch b;
	
	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}
    public void setBranch(Branch b)
    {
    	this.b=b;
    }
    public Branch getBranch()
    {
    	return b;
    }
	
    
	
    
	
	  
	

}
