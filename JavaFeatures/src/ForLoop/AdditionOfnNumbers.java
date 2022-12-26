package ForLoop;


	import java.util.Scanner;

	class AdditionOfnNumbers
	{
		public static void main(String a[])
	    {      
	int add=0;
	    	Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        for(int i=1;i<=num;i++)
	        {
	          add=add+i;
	        }
	    System.out.println(add);
}
}