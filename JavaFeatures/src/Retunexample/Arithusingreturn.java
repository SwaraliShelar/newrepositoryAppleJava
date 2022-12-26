/*7.Write java Program for arithmetic operation for each operation write 
separate Method using parameter passing and return type.
 */
package Retunexample;

import java.util.Scanner;

public class Arithusingreturn {
int a;
int b;
//without using display
int addition(int a,int b)
{
	
	int add=a+b;
	System.out.println("Addition is:"+add);//we write syso(); here because we cannot use a display method here
	return add;
}
int substraction(int a,int b)
{
	
	int sub=a-b;
	System.out.println("Substration is:"+sub);//we write syso(); here because we cannot use a display method here
	return sub;
}
int mutiplication(int a,int b)
{
	
	int mul=a*b;
	System.out.println("mutiplication is:"+mul);//we write syso(); here because we cannot use a display method here
	return mul;
}
float division(int a,int b)
{
	
	float divi=a/b;
	System.out.println("division is:"+divi);//we write syso(); here because we cannot use a display method here
	return divi;
}

public static void main(String[] args) {
	Arithusingreturn ao=new Arithusingreturn();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two number:");
	System.out.println("enter first number:");
	int a=sc.nextInt();
	System.out.println("enter second number:");
	int b=sc.nextInt();
	//we use  the return in a methods and we have to return value from the methods
	//we have store that return value in new variable thats why we use int add,int sub,int mul,float divi
	int add=ao.addition(a,b);
	int sub=ao.substraction(a,b);
	int mul=ao.mutiplication(a,b);
	float divi= ao.division(a,b);
	
}
}
//using display
/*int addition(int a,int b)
{	
	int add=a+b;	
	return add;
}

int substraction(int a,int b)
{
	int sub=a-b;
	return sub;
}

int mutiplication(int a,int b)
{	
	int mul=a*b;	
	return mul;
}

float division(int a,int b)
{
	float divi=a/b;
	return divi;
}
//we use display method thats why we cannot give the syso(); in return 	

void display(int add,int sub,int mul,float divi)
{
	System.out.println("Addition is:"+add);
	System.out.println("Substration is:"+sub);
	System.out.println("mutiplication is:"+mul);
	System.out.println("division is:"+divi);
}
public static void main(String[] args) {
	Arithusingreturn ao=new Arithusingreturn();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two number:");
	System.out.println("enter first number:");
	int a=sc.nextInt();
	System.out.println("enter second number:");
	int b=sc.nextInt();
	//we use  the return in a methods and we have to return value from the methods
	//we have store that return value in new variable thats why we use int add,int sub,int mul,float divi
	int add=ao.addition(a,b);
	int sub=ao.substraction(a,b);
	int mul=ao.mutiplication(a,b);
	float divi= ao.division(a,b);
	ao.display(add, sub, mul, divi);	
}
}
*/
//by using simple method
/*void addition(int a,int b)
{ 
	System.out.println("addition is:"+(a+b));
}
void substration(int a,int b)
{
	System.out.println("substraction is:"+(a-b));
}
void multiplication(int a,int b)
{	
	System.out.println("multiplication is:"+(a*b));
}
void division(int a,int b)
{
	System.out.println("division is:"+(a/b));
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter two numbers:");
	System.out.println("enter first number:");
	int a=sc.nextInt();
	System.out.println("enter second number:");
	int b=sc.nextInt();
	Arithusingreturn ao=new Arithusingreturn();
	ar1.addition(a,b);
	ar1.substration(a, b);
	ar1.multiplication(a, b);
	ar1.division(a, b);
}*/

