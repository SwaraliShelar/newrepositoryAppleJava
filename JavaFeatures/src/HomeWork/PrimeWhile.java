package HomeWork;

public class PrimeWhile {

	public static void main(String[] args) {
		int i = 2, num = 33;
		boolean flag = false;
		while (i <= num / 2) {

			if (num % i == 0) {
				flag = true;
				break;
			}
			i++;
		}
		if (!flag)
			System.out.println(num + " prime number");
		else
			System.out.println(num + " not prime number");
	}
}
