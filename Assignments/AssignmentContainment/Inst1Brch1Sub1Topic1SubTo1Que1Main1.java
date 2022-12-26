package AssignmentContainment;

public class Inst1Brch1Sub1Topic1SubTo1Que1Main1
{
	public static void main(String[] args) {
		
	
Question1 q=new Question1("6","What is inheritance??");
SubTopic1 st=new SubTopic1("5","inheritance",q);
Topic1 t=new Topic1(4,"Java",st);
Subject1 s=new Subject1(3,"Core Java",t);
Branch1 b=new Branch1(2,"BCS",s);
Institute1 i=new Institute1(1,"YCIS Satara",b);

System.out.println("Information about Institute:\n");
System.out.println(i);
}
}