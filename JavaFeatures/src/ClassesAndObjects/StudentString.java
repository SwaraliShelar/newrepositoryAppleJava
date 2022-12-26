package ClassesAndObjects;

public class StudentString {
	int id;
	String name;
	int m1,m2,m3;
	float per;
	void acceptDetails(int id1,String name1,int m11,int m12,int m13)
	{
		id=id1;
		name=name1;
		m1=m11;
		m2=m12;
		m3=m13;
	}
    void display()
	{
		System.out.println("In display method already print intostring()");
	}
	public String toString()
	{
		
		return id+"\n"+name+"\n"+m1+m2+m3; 
	}
	public static void main(String[] args) 
	{
		StudentString s=new StudentString();
		
	   s.acceptDetails(1,"swara",45,76,90);
       System.out.println(s);
       s.display();
	}
}
