
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 5, c = 2;
		int ans1 = (a + b) / c ;
		int  ans2 = (a + b) % c ;
		System.out.println("answer : " + ans1);
		System.out.println("answer : " + ans2);
       //a=a+5; here is your modified assignment operator works
		a+=5;
       System.out.println("modified value of a : " +a);
       //Relational operator
       boolean ans3 = 10>5;
       System.out.println("Answer of Boolean Operation is:"+ans3);
       //to check more than 2 relational operators its used logical operators
       int age=24;
       char city='p';
       // to check both condition are true
       boolean ans4 = (age>18)&&(city=='p' );
       System.out.println("Desigion to open account in bank:"+ans4);
    // to check only one condition true 
       boolean an = (city=='n')||(age>18 );
       System.out.println("Desigion to open account in bank:"+an);
       
       // unary operator
       //++a  pre increment operator
       //a++  post increment operator
       int x=10;
       int y=++x;
       //increment available value of x then use that value for your purpose
       System.out.println("y=" +y);
       System.out.println("x= "+x);
       int x1=10;
       int y1=x1++;
       //  use the value of  and then increment the available value
       System.out.println("y1=" +y1);
       System.out.println("x1= "+x1);
       
       
	}
 
  }
