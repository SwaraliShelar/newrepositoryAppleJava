package AssignmentNo5;

import UpcastingAndDowncasting.Child;

public class KidTeenagerMain {
public static void main(String[] args) {
	Kid k1=new Kid();
	Kid k2=new Kid();
	//Teenagers t1=new Teenagers();
	//Bigkid b1=new Bigkid();
	//Teenagers t1=(Teenagers)k2;
	Bigkid b1=(Bigkid)k1;
	 k1 =new Bigkid();
   //  Child c = (Child)p;   
   
	 //upcasting storing a child object into parent class reference
	k2=new Teenagers();
	k1.readBook("tom and jerry cartoon",2);
	k2.readBook("herry potter",7);
	
	
	
	 
}
}