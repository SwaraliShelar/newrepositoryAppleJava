package Tasks;

public class prime {
	public static void main(String[] args) {

	int num=13;
	boolean flag =true;
    int i=2;
    while(i<num)
     {
		if(num%i==0)
		  flag=false;
		break;
	 }i++;
	 if(flag==true)
	 {
		 System.out.println(num+" prime number");
	 }
	 else
	 {
	 System.out.println(num+" non prime number");
	 }
}
}
