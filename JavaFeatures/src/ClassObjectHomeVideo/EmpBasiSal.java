package ClassObjectHomeVideo;

public class EmpBasiSal {
int id;String name;
float basicsal,hra,da,grosssal;
EmpBasiSal()
{
	id=1;
	name="rajesh";
	basicsal=45000.00f;
}
EmpBasiSal(int i,String nam,float bl,float h,float d)
{
	id=i;
	name=nam;
	basicsal=bl;
	hra=h;
	da=d;
}
float calculation()
{
	hra=0.35f*basicsal;
	da=	0.20f*basicsal	;
	grosssal=basicsal+hra+da;
	return grosssal;
}
void showDetails(float calculation)
{
	System.out.println("Employee id:"+id);
	System.out.println("Employee name:"+name);
	System.out.println("Employee Basicsalary:"+basicsal);
	System.out.println("Employee hra:"+hra);
	System.out.println("Employee da:"+da);
	System.out.println("Employee gross salary:"+grosssal);
}
public static void main(String[] args)
{
	EmpBasiSal emp1=new EmpBasiSal();
	float totalcal1= emp1.calculation();
	emp1.showDetails(totalcal1);
	
	System.out.println();
	
	EmpBasiSal emp2=new EmpBasiSal(101,"pooja",2000.00f,0.35f,0.20f);
	float totalcal2= emp2.calculation();
	emp2.showDetails(totalcal2);
}
}
