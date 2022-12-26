/*2.WAP to use containment for following hierarchy. Fill all data and print all 
data: (id is a integer number, name is a String)
 */
package AssignmentContainment;

public class Institute1 {

	private int iid;
	private String iname;
	Branch1 b1;
	Institute1( int iid, String iname,Branch1 b1)
	{
		this.iid=iid;
		this.iname=iname;
		this.b1=b1;
	}
	public String toString()
	{
		return "Institute Id:"+iid+"\nInstitute Name:"+iname+"\n"+b1;
	}
}
