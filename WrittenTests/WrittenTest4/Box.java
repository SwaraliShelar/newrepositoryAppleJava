/*
  3.Create class Box and calculate the volume of box 

volume=length x width x height
 */
package WrittenTest4;

import java.util.Scanner;

public class Box {
	public static void main(String[] args) {
		Box b1=new Box();
		int tvol=b1.vol();
		b1.display(tvol);	
	}
	int volume;
	Scanner sc=new Scanner(System.in);
	int vol()
	{
		System.out.println("enter values of length,width and height:");
		int length=sc.nextInt();
		int width=sc.nextInt();
		int height=sc.nextInt();

		volume=length * width * height;
		return volume;
	}
	void display(int vol)
	{
		System.out.println("volume of box is:"+volume);
	}

}
