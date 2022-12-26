package Polymorphism;

public class Addition {
void add(int a,int b)
{
	System.out.println("Addition of two numbers:"+(a+b));
}
void add(int a,String b,int d)
{
	System.out.println("Addition of int,string and int is:"+(a+b+d));
}
void add(int b,float a,String d)
{
	System.out.println("Addition of int,float,string is:"+(b+a+d));
}
void add(String a,int b,int c,String d)
{
	System.out.println("Addition of string,int,int and string is:"+(a+b+c+d));
}
void add(String b,String a)
{
	System.out.println("Addition of 2 string is:"+(b+a));
}
public static void main(String[] args) {
	Addition a1=new Addition();
	a1.add("good","luck");
	a1.add(10, 20);
	a1.add(10, 1.7f,"abc");
    a1.add("g", 0, 0, "d");
    a1.add(10,"abcd",10);
}
}
