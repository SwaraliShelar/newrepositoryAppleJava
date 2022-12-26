package WhileLoopExample;

public class ContinueExample {
public static void main(String[] args) {
	
	
	int i = 0;
	while (i < 10) {
	  if (i == 4) {
	 i++;//for print 0 1 2 3
	    continue;
	  }
	  System.out.println(i);
	  i++;//for print 5 6 7 8 9
	}
	
}
}
