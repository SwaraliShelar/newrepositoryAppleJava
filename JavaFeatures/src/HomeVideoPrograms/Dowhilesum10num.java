package HomeVideoPrograms;

public class Dowhilesum10num {
public static void main(String[] args) {
	int i=1,sum=0;
	do
	{
		System.out.println(i+" ");
		sum=sum+i;

		i++;
	}while(i<=10);
	System.out.println("sum of first 10 numbers:"+sum);
	System.out.println("end the loop");//i=11
}
}
