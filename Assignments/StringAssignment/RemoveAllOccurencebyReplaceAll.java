package StringAssignment;
//17.Write a Java program to remove all occurrences of a character from string. replaceALL()
public class RemoveAllOccurencebyReplaceAll
{
public static void main(String[] args) 
{
	String s="satara is very beautiful city";
	String s1=s.replaceAll("is", "satara");//remove all occurrences of a character from string
	System.out.println(s1);//by using replaceAll method()
}
}
