package AssignmentInheritancePolymorphism;

public class KidTeenagerMain {
public static void main(String[] args) {
	Kid k1=new Kid();
    Kid k2=new Kid();
	//Teenager t1=(Teenager)k1;
	//t1.readBook("jhkjh", 1000);
	
	//Kid k2=new Kid();
	k1=new Bigkid();
	k1.readBook("harry potter",2);
	
	k2=new Bigkid();
	k2.readBook("tom and jerry",10);
	//Bigkid b1=(Bigkid)k2;
	
}
}
