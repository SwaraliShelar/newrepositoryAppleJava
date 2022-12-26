package Interface;

public class CarMain {
	
		public static void main(String[] args) 
		{
			Swift  s= new Swift();
			s.milage(40);
			s.crashTest();
			s.seatWormer();
			s.speedTest(110.00f);
			s.breakTest();
			s.dashboard();
			s.loadTesting("250");
		}
	}

