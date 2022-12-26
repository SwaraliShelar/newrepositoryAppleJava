/*print the fibonacci series
0 
0 1 
0 1 1 
0 1 1 2 
0 1 1 2 3 
0 1 1 2 3 5 
if you want to print  0 1 then initialize after fibonnacci series block 
 */
package PatternProgram;

public class PatternFibonnacci2 {
	public static void main(String[] args) {

		int a = 0, b = 1, c;

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				c = a + b;
				a = b;
				b = c;
			}
			a = 0;// for print 0 1
			b = 1;
			System.out.println();
		}
	}
}