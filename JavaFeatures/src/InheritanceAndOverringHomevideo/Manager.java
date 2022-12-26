package InheritanceAndOverringHomevideo;

public class Manager extends Employee
{
  float incentive;
  public void setIncentive(float incentive)
  {
	  this.incentive=incentive;
  }
  public float getIncentive()
  {
	  return incentive;
  }
  void displayManagerDetails()
  {
	  displayEmployeeDetails();
	  System.out.println("Incentive paid in RS."+getIncentive());
  }
}
