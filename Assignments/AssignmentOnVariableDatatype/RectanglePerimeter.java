//3. Write a Java program to enter length and breadth of a rectangle and find its perimeter
package AssignmentOnVariableDatatype;



public class RectanglePerimeter {
	public static void main(String[] args) {
		
		
		float a=2,b=4; //a=c=2  in rectangle sides opposite to each other are equal in length  
		               //b=d=4  length of opposite sides  
		
		// Suppose a, b, c, d are the four sides of rectangle and a=c and b=d
      
        //Perimeter Of Rectangle= a+ b+ c+ d= a+ b+ a+ b= 2*(a + b).
	   
		
		float perimeter = 2 * (a + b);
		System.out.println("perimetr of rectangle :" + perimeter);
		
	}
}
