package Retunexample;

public class PerTotal {
	float total(int m1,int m2,int m3)//23,54,45
	{
		float tot=m1+m2+m3;//23+54+45
		return tot;//

	}
	void percentage(float total)
	{
		float per=total/3;
		System.out.println("percentage is : "+per+"%");
	}
   public static void main(String[] args) {
   int p1=23,p2=54,p3=45;
   PerTotal pt=new PerTotal();
   float stotal=pt.total(p1, p2, p3);//23,54,45
   pt.percentage(stotal);
}
}