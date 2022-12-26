//11.Find all prime number between 400 to 300;
package ForLoop;

public class PrimeNumber400To300 {
	public static void main(String[] args) {

		for (int i = 400; i >= 300; i--) {
			int j;
			for (j = 2; j <= i / 2; j++) {
				if (i % j == 0)
					break;
			}
			if (j > i / 2)
				System.out.println(i);
		}

	}
}
