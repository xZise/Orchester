package orchester;

import java.util.LinkedList;

import lied.Lied;
import lied.Note;
import lied.Taktzeit;
import instrumente.Instrument;

public class Orchester {
	
	private LinkedList<Instrument> instrumente;
	
	public Orchester(){
		instrumente = new LinkedList<Instrument>();
	}

	public void hinzufügenInstrument(Instrument instrument) {
		instrumente.add(instrument);
	}

	public void liedAbspielen(Lied lied) {
		
		Taktzeit abspielZeit = new Taktzeit();
		
		while(abspielZeit.holeZeit() < lied.holeMaxZeit().holeZeit()){
			
			LinkedList<Note> abzuspielendeNoten = lied.holeNote(abspielZeit);
			
			for(Note note : abzuspielendeNoten){
				for(Instrument instrument : instrumente) {
					if(instrument.equals(note.holeInstrument())){
						instrument.spieleNote(note);
					}
				}
			}
			
			abspielZeit.weiter(lied.holeTakt().weiter());
		}
		
		
	}

	public void setzeAlternativeInstrument(Instrument orginal,
			Instrument alternative) {

	}

}
