package lied;

import instrumente.Instrument;
import instrumente.Klavier;

/**
 * Eine Note wird von einem Instrument gespielt und hat eine gewisse Tonhöhe
 * @author Max
 *
 */
public class Note {
	
	/**
	 * Das Instrument welches den Ton abspielen soll
	 */
	private final Instrument instrument;
	/**
	 * Die Tonhöhe in welcher gespielt werden soll
	 */
	private final Tonhöhe tonhöhe;
	
	/**
	 * Hier wird ein neuer Ton erstellt
	 * @param instrument Das Instrument welches den Ton abspielen soll
	 * @param tonhöhe Die Tonhöhe in welcher gespielt werden soll
	 */
	public Note(Instrument instrument, Tonhöhe tonhöhe){
		if(instrument == null){
			instrument = new Klavier();
		}
		this.instrument = instrument;
		this.tonhöhe = tonhöhe;
	}
	
	/**
	 * Welches Instrument spielt diesen Ton?
	 * @return Das Instrument welches den Ton abspielen soll
	 */
	public Instrument holeInstrument() {
		return instrument;
	}

	/**
	 * Welche Tonhöhe besitzt der Ton?
	 * @return Die Tonhöhe in welcher gespielt werden soll
	 */
	public Tonhöhe holeTonhöhe() {
		return tonhöhe;
	}

}
