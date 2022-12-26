package Tasks;

public class PrimeNumber {
public static void main(String[] args) {
	int num=13;
	boolean flag=true;//flag=0
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
			flag=false;//flag=1
		break;		
	}
	if(flag==true)
		System.out.println(num +" is prime number");
	else
		System.out.println(num +" is not prime number");
}
}
/*if(flag==false)
System.out.println(num +" is not prime number");
else
System.out.println(num +" is prime number");*/