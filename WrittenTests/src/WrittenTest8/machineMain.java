package WrittenTest8;

public class machineMain {

	public static void main(String[] args) {
		Juicer j= new Juicer();
		j.crush();
		j.rotate();
		j.filter();
		Machine m=new Juicer();//upcasting
		/*Machine m;
		m=new Juicer();*/
		m.crush();
		m.rotate();	
	}

}
