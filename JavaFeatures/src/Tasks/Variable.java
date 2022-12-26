package Tasks;

public class Variable {
	int x;
	String name;
public static void main(String[] args) {
	Variable vb=new Variable();
	
	System.out.println(vb.x);
	System.out.println(vb.name);
    vb.x=1000;
    vb.name="ycis";
    System.out.println(vb.x);
    System.out.println(vb.name);
}
}
