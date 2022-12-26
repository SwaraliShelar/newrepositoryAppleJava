/*13.Create a class to print an integer and a character with two methods having 
the same name but different sequence of the integer and the character 
parameters.For example, if the parameters of the first method are of the 
form (int n, char c), then that of the second method will be of the form 
(char c, int n).

 */
package AssignmentNo4;

public class ExampleOverloading
{
	void exmpleintchar(int i,char c)
	 {		
		System.out.println(i +" st letter in alphabates is "+c);
	 }
	void exmpleintchar(char c,int i)
	{
		System.out.println(c+" is the "+ i +" th letter in alphabates");
	}
	public static void main(String[] args)
	{
		ExampleOverloading exo=new ExampleOverloading();
		exo.exmpleintchar(1,'a');
		exo.exmpleintchar('d',4);

	}
}
