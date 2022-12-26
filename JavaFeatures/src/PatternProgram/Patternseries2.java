// print the series 1 5 13 25 41 61
//logic is   j=1 j=1+4*1=5  j=5+4*2=13 j=13+4*3=25 j=25+4*4=41 j=41+4*5=61
package PatternProgram;

public class Patternseries2 {
public static void main(String[] args) {
	int j=1,k=4;           //j=1,k=4          j=5,k=4     j=13,k=4        j=25,k=4      j=41,k=4       j=61,k=4      j=85
	for(int i=1;i<=6;i++)  //i=1               i=2          i=3              i=4           i=5           i=6       but(i<=6)
	{
		System.out.print(j+" ");//j=1         j=5           j=13             j=25          j=41          j=61
		j=j+(k*i);       //j=1+(4*1)=5     j=5+(4*2)=13  j=13+(4*3)=25  j=25+(4*4)=41   j=41+(4*5)=61  j=61+(4*6)=85
	}
}
}
