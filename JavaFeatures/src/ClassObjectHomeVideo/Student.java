package ClassObjectHomeVideo;

public class Student {
	int Roll_no;
	String name;
	int physics,chemistry ,mathematics;
	String hobbie;
	long contno;
	Student()
	{
		//3.calling one constructor to another
		this(1,"pooja",89,76,80);
	}
	Student(int Roll_no,String name,int physics,int chemistry,int mathematics )
	{
		//2.to avoid shadowing of instance variable
		this.Roll_no=Roll_no;
		this.name=name;
		this.physics=physics;
		this.chemistry=chemistry;
		this.mathematics=mathematics;	
		System.out.println();
		//we call display method() here
		displayDetails();//this.displayDetails();
	}
	/*Student(String hobbie,long contno)
	{  
		this.hobbie=hobbie;
		this.contno=contno;
		System.out.println();
		//we call display method() here
	    displayDetails();//this.displayDetails(); 
	}*/
	
	void displayDetails()
	{
	   //1.to refer current object
	   // there is no need to write this.ref_var every time because your current object refers automatically
        System.out.println("student details:");
	    System.out.println("student Roll_no:"+Roll_no);
		System.out.println("student name:"+name);
		System.out.println("physics marks:"+physics);
		System.out.println("chemistry marks:"+chemistry);
		System.out.println("mathematics marks:"+mathematics);
		//System.out.println("Student hobbie:"+hobbie);
	  //System.out.println("Student contno:"+contno);

		/*this keyword helps to refer a current object
	    / there is no need to write this.ref_var every time because your current object refers automatically
	    
		System.out.println("student Roll_no:"+this.Roll_no);
		System.out.println("student name:"+this.name);
		System.out.println("physics marks:"+this.physics);
		System.out.println("chemistry marks:"+this.chemistry);
		System.out.println("mathematics marks:"+this.mathematics);
		System.out.println("Student hobbie:"+this.hobbie);
		System.out.println("Student contno:"+this.contno);*/
		
	    
	}
public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student(2,"shweta",83,96,50);
	//Student s3=new Student("reading book",987654224);
	//we call display method() in constructor
  /*s1.displayDetails();
    System.out.println();
    s2.displayDetails();
    System.out.println();
    s3.displayDetails();*/
}
}
