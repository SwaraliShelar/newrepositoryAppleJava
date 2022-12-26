package Interface;

interface MobilePhone 
{
	void calling();
	void messaging();
	void fmRadio();
	void memortRAM();
	void calculator();
	void battery();
	void display();
	void clock();
}
class NoramalMobile implements MobilePhone
{
	public void calling()
	{
		System.out.println("every mobile have a calling facility");
	}
	public void messaging()
	{
		System.out.println("every mobile provides messaging facility");
	}
	public void fmRadio()
	{
		System.out.println("FmRadio is used to listend a songs,or news");
	}
	public void memortRAM()
	{
		System.out.println("mobile have memory to store a data");
	}
	public void calculator()
	{
		System.out.println("calculator provided for calculation ");
	}
	public void battery()
	{
		System.out.println("every mobile have a battery");
	}
	public void display()
	{
		System.out.println("we can see the mobile display");
	}
	public void clock()
	{
		System.out.println("clock is used shows time");
	}
	void game()
	{
		System.out.println("in phone there is a snake game");
	}
}

class SmartPhone  implements MobilePhone 
{
	public void calling()
	{
		System.out.println("SmartPhone calling facility");
	}
	public void messaging()
	{
		System.out.println("SmartPhone messaging facility");
	}
	public void fmRadio()
	{
		System.out.println("FmRadio is used to listend a songs,or news");
	}
	public void memortRAM()
	{
		System.out.println("SmartPhone memory  RAM");
	}
	public void calculator()
	{
		System.out.println("calculator provided for calculation ");
	}
	public void battery()
	{
		System.out.println("SmartPhone and alsoprovide LEC battery");
	}
	public void display()
	{
		System.out.println("SmartPhonehave wide mobile display");
	}
	public void clock()
	{
		System.out.println("clock is used shows time");
	}
	void highPixelCamera()
	{
		System.out.println("In smartphones highpixel camera quality is provieded");
	}
	void Apps()
	{
		System.out.println("SmartPhone provides various gaming like applications and youtube,playstore.etc it also support android");
	}
	void safetyFeatures()
	{
		System.out.println("Smartphone provides password for protection that you want to secured");
	}
	public void game()
	{
		System.out.println("in phone there is a snake game the smartPhone provides various games like candycrush,pubG,subwaysufferd etc");
	}
	
}



