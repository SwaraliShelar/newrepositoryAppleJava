package AssignmentNo6;

import AssignmentNo6.MusicalInstrument.PercussionInstrument;
import AssignmentNo6.MusicalInstrument.StringedInstrument;

public class MusicalInstrumentMain 
{

	public static void main(String[] args) {
		
				PercussionInstrument tabla = new PercussionInstrument();
				tabla.play();
				tabla.listenSound();
				MusicalInstrument.learnInstrument();
                System.out.println();
				StringedInstrument violin = new StringedInstrument();
				violin.play();
				violin.listenSound();
				MusicalInstrument.learnInstrument();
			}
		}
