package AssignmentContainment;

public class InstiBranchSubTopicSubTopicQuestMain
{
	public static void main(String[] args) {
		
Question q=new Question();
q.setQid("6");
q.setQname("What is method overloading and method overridding??");

SubTopic st=new SubTopic();
st.setStid(5);
st.setStname("Polymorphism");
st.setQuestion(q);

Topic t=new Topic();
t.setTid(4);
t.setTname("Core Java");
t.setSubTopic(st);

Subject s=new Subject();
s.setSid(3);
s.setSname("Java");
s.setTopic(t);

Branch b=new Branch();
b.setBid(2);
b.setBname("Batchlers Of Computer Science");
b.setSubject(s);

Institute i=new Institute();
i.setIid(1);
i.setIname("YCIS Satara.");
i.setBranch(b);

System.out.println("Information about Institute:");
System.out.println("Institute id:"+i.getIid()+"\nInstitute Name:"+i.getIname()+"\n"+b);
}
}