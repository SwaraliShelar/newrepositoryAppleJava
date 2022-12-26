package InheritanceAndOverringHomevideo;

public class EmpMngerSalesMngerMultiLevelInheritnc
{
public static void main(String[] args) {
	SalesManager sm=new SalesManager();
	sm.acceptEmployeeDetails("mr rathod",20,40000);
	sm.setIncentive(2200.00f);
	sm.setTarget(1100.00f);
	sm.displaySalesManagerdetails();
}
}
