package orchester;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;

import lied.Lied;
import lied.Note;
import lied.Taktzeit;
import instrumente.Instrument;
import instrumente.Instruments;

/**
 * Ein Orchester beinhaltet mehrere Instrumente und kann Lieder spielen
 * @author Max
 *
 */
public class Orchester {

	/**
	 * Die Instrumente spielen die Töne der Class der sie zugeordnet sind
	 */
	private Map<Instruments, Instrument> instrumente;

	/**
	 * Der Konstruktor initialisiert ein Orchester
	 */
	public Orchester() {
		//instrumente = new LinkedList<Instrument>();
		instrumente = new EnumMap<Instruments, Instrument>(Instruments.class);
	}

	/**
	 * Instrumente dem Orchester hinzufügen
	 * @param instrument ist danach im Orchester
	 */
	public void hinzufügenInstrument(Instrument instrument) {
		//instrumente.add(instrument);
		instrumente.put(instrument.getInstrument(), instrument);
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
				instrumente.get(note.holeInstrument()).spieleNote(note);
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
		instrumente.put(orginal.getInstrument(), alternative);

	}

}
