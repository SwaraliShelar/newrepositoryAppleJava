package DynamicMethoDispatchOverridingExample;

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
  public Float calculateSalary()
  {
		//overriding method of parent class into a child class
	  System.out.println("salary calculated with incentive:");
      return salary+incentive;
  }
  void displayManagerDetails()
  {
	  displayEmployeeDetails();
	  System.out.println("Incentive paid in RS."+getIncentive());
  }
}
