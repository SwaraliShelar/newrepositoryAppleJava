package WhileLoopExample;

public class EvenExample {
	public static void main(String[] args) {

		int i = 1;
		System.out.println("enter a number :");

		while (i <= 10) {
			if (i % 2 == 0)
				System.out.println(i + " ");

			i++;

		}
		System.out.println("number is even number");

	}
}
