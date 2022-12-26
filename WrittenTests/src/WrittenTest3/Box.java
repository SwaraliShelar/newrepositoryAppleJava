//1.	Create class Box and calculate the volume of box volume=length x width x height (create separate method for volume).
package WrittenTest3;

import java.util.Scanner;

public class Box 
{
	void volume(int l, int w, int h)
	{
		int volume = l * w * h;
		System.out.println("volume of box is:" + volume);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length width and height of the box:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		Box b1 = new Box();
		b1.volume(a, b, c);
	}
}
