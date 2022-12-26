package InheritanceAndOverringHomevideo;

public class SalesManager extends Manager{
  float target;
  public void setTarget(float t)
  {
	  target=t;
  }
  public float getTarget()
  {
	  return target;
  }
  void displaySalesManagerdetails()
  {
	  displayManagerDetails();
	  System.out.println("Sales manager Achieved target for Q."+getTarget());
  }
}
