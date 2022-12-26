package WhileLoopExample;

public class AdditionOfNumber {
	public static void main(String[] args) {

		int i = 1, sum = 0, limit = 5;

		while (i <= limit) // i=1 i=2 i=3 i=4 i=5
		{
			sum = sum + i;// sum=0+1=1 sum=1+2=3 sum=3+3=6 sum=6+4=10 sum=10+5=15
			i++;
		}

		System.out.println("addition of number : " + sum);

	}
}
