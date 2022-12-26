package Interface;
public class Mobile
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("NormalPhone Info");
		NoramalMobile n = new NoramalMobile();
		n.game();
		n.calling();
		n.messaging();
		n.fmRadio();
		n.calculator();
		n.battery();
		n.display();
		
		System.out.println();
		
		SmartPhone sp=new SmartPhone();
		sp.Apps();
		sp.battery();
		sp.calculator();
		sp.calling();
		sp.clock();
		sp.display();
		sp.fmRadio();
		sp.game();
		sp.highPixelCamera();
		sp.memortRAM();
		sp.messaging();
		sp.safetyFeatures();
		
		}	
	}