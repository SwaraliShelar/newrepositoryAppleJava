package AssignmentNo6;

/*10.Write MusicalInstrument interface with play method. It also has common 
behavior (static) learnInstrument. Create Abstract class Sound with abstract 
method listenSound.Implement MusicalInstrument interface in 
PercussionInstrument and StringedInstrument classes.Also extend Sound class 
in both classes.Create object ‘Tabla’ of PercussionInstrument class and object 
‘Violin’ of StringedInstrument class.call Play, learnInstrument and listenSound 
methods of both objects*/
interface MusicalInstrument {
	void play();

	static void learnInstrument() {
		System.out.println("In MusicalInstrument class we learn how to play instruments.");
	}

	abstract class Sound {
		abstract void listenSound();
	}

	class PercussionInstrument extends Sound implements MusicalInstrument {
		@Override
		public void play() {
			System.out.println("PercussionInstrument is indian culture Instrument like tabla");
		}

		public void listenSound() {
			System.out.println("listen the sound of PercussionInstrument");
		}

	}

	class StringedInstrument extends Sound implements MusicalInstrument {
		@Override
		public void play() {
			System.out.println("StringedInstrument is very modern culture Instrument like violin");
		}

		public void listenSound() {
			System.out.println("listen the sound of StringedInstrument");

		}

	}
}