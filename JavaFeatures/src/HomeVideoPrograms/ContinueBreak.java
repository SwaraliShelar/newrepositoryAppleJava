package HomeVideoPrograms;

public class ContinueBreak {
public static void main(String[] args) {
	//print table of 2 but skip the 5th value and break after 8th value
	int i=0,num=2;
/*	while(i<=10)
	{   
		i++;
		if(i==5)// skip value 10
		  continue;
		if(i==8)
		  break;// break the stmt from 8th position
		System.out.println(i*num);
	}*/
	
	do
	{   
		i++;
		if(i==5)// skip value 10
		  continue;
		if(i==8)
		  break;// break the stmt from 8th position
		System.out.println(i*num);
		}while(i<=10);
		 
	
	/*
	for(i=1;i<=10;i++)
	{   
		if(i==5)// skip value 10
		  continue;
		if(i==8)
		  break;// break the stmt from 8th position
		System.out.println(i*num);	
	}*/
	 
}
}
