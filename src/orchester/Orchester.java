package orchester;

import java.util.HashMap;
import java.util.LinkedList;

import lied.Lied;
import lied.Note;
import lied.Taktzeit;
import instrumente.Instrument;

/**
 * Ein Orchester beinhaltet mehrere Instrumente und kann Lieder spielen
 * @author Max
 *
 */
public class Orchester {

	/**
	 * Die Instrumente spielen die Töne der Class der sie zugeordnet sind
	 */
	private HashMap<Class, Instrument> instrumente;

	/**
	 * Der Konstruktor initialisiert ein Orchester
	 */
	public Orchester() {
		//instrumente = new LinkedList<Instrument>();
		instrumente = new HashMap<Class, Instrument>();
	}

	/**
	 * Instrumente dem Orchester hinzufügen
	 * @param instrument ist danach im Orchester
	 */
	public void hinzufügenInstrument(Instrument instrument) {
		//instrumente.add(instrument);
		instrumente.put(instrument.getClass(), instrument);
	}

	/**
	 * Spielt ein Lied im Takt einmal mit den vorhandenen Instrumenten
	 * ab
	 * @param lied das Lied was abgespielt werden soll
	 */
	public void liedAbspielen(Lied lied) {

		Taktzeit abspielZeit = new Taktzeit(0);

		while (abspielZeit.holeZeit() < lied.holeMaxZeit().holeZeit()) {

			LinkedList<Note> abzuspielendeNoten = lied.holeNote(abspielZeit);

			for (Note note : abzuspielendeNoten) {
				instrumente.get(abzuspielendeNoten.getClass()).spieleNote(note);
			}

			abspielZeit.weiter(lied.holeTakt().weiter());
		}

	}

	/**
	 * Weist Instrumenten eine andere Instrumentengruppe zu
	 * @param orginal Die Töne dieses Instruments sollen gespielt werden
	 * @param alternative Dieses Instrument soll sich als ein anderes ausgeben
	 */
	public void setzeAlternativeInstrument(Instrument orginal,
			Instrument alternative) {
		instrumente.put(orginal.getClass(), alternative);

	}

}
