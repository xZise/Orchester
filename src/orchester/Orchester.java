package orchester;

import java.util.HashMap;
import java.util.LinkedList;

import lied.Lied;
import lied.Note;
import lied.Taktzeit;
import instrumente.Instrument;

public class Orchester {

	//private LinkedList<Instrument> instrumente;
	private HashMap<Class, Instrument> instrumente;

	public Orchester() {
		//instrumente = new LinkedList<Instrument>();
		instrumente = new HashMap<Class, Instrument>();
	}

	public void hinzufügenInstrument(Instrument instrument) {
		//instrumente.add(instrument);
		instrumente.put(instrument.getClass(), instrument);
	}

	public void liedAbspielen(Lied lied) {

		Taktzeit abspielZeit = new Taktzeit();

		while (abspielZeit.holeZeit() < lied.holeMaxZeit().holeZeit()) {

			LinkedList<Note> abzuspielendeNoten = lied.holeNote(abspielZeit);

			for (Note note : abzuspielendeNoten) {
				instrumente.get(abzuspielendeNoten.getClass()).spieleNote(note);
			}

			abspielZeit.weiter(lied.holeTakt().weiter());
		}

	}

	public void setzeAlternativeInstrument(Instrument orginal,
			Instrument alternative) {
		instrumente.put(orginal.getClass(), alternative);

	}

}
