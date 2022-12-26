package AssignmentInheritancePolymorphism;

public class IPLCSKRCBKKRMainHirarchical {
	public static void main(String[] args) {
		CSK c=new CSK();
		c.setTeamname("CSK");
		c.setOwnername("Priti Zinta");
		c.setPlayernumbers(11);
		CSK.changeStadiumname("vankhede stadium");
		c.display();
		
		RCB r=new RCB();
		r.setTeamname("RCB");
		r.setOwnername("nita ambani");
		r.setPlayernumbers(12);
		RCB.changeStadiumname("vankhede stadium");
		r.display(); 
		
		KKR k=new KKR();
		k.setTeamname("KKR");
		k.setOwnername("Shahrukh khan");
		k.setPlayernumbers(10);
		RCB.changeStadiumname("vankhede stadium");
		k.display();
		}
}
