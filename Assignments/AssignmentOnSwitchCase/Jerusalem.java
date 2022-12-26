package AssignmentOnSwitchCase;

public class Jerusalem {
	  
		    public static void main(String args[]) {
		        int i = 1, j = 0;
		        //i=1 but there is no case 1 then it will go to default
		        switch (i) {
		            case 2 :
		                j += 6;
		            case 4 :
		                j += 1;
		            default :  //from given
		                j += 2;//j=j+2       j=(j=0)+2=2       j=2
		            case 0 :
		                j += 8;//j=j+8       j=(j=2)+8=10      j=10
		        }
		        System.out.println("j = " + j);
		    }
		}


