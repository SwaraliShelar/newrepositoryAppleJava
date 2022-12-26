package Constructor;

public class AcntBankStatic {
public static void main(String[] args) {
	AcountStatic as1=new AcountStatic();
	AcountStatic as2=new AcountStatic(9876,"rutu",20000.00f);

	as1.display();
	as2.display();

	//AcountStatic.changeValue(4.5f);	
	//as1.display();
	//as2.display();

}
}
