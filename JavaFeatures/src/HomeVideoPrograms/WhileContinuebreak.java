package HomeVideoPrograms;

public class WhileContinuebreak {
public static void main(String[] args) {
	int i=1;
	while(i<=10)
	{
		i++;//i=2
		if(i==6)
			continue;
		System.out.println(i);
		
	}System.out.println("end of loop");
	
	/* int i=1;
	while(i<=10)
	{
		i++;
		if(i==6)
			break;
		System.out.println(i);
		
	}System.out.println("end of loop");*/
}
}
