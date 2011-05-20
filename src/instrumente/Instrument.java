package instrumente;


import lied.Note;

/**
 * Ein Instrument
 * @author Max
 *
 */
public interface Instrument {

	/**
	 * Diese Methode lässt ein Instrument eine Note spielen
	 * @param note die abzuspielende Note
	 */
	void spieleNote(Note note);

	
}
