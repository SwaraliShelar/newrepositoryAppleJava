//13
package AssignmentOnSwitchCase;
 public class Price13{
  public static void main(String a[]){
	int price = 6;
	switch (price) {
		case 2: System.out.println("It is: 2");
		default: System.out.println("It is: default");
		//because price=6 and there is no case 6
		//then it will go to the default also print values value of default and after default
		//i.e case 5 and case 6
		case 5: System.out.println("It is: 5");
		case 9: System.out.println("It is: 9");
	}
}
}