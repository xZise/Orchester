package lied;

import instrumente.Instruments;

/**
 * Eine Note wird von einem Instrument gespielt und hat eine gewisse Tonhöhe
 * @author Max
 *
 */
public class Note {
	
	/**
	 * Das Instrument welches den Ton abspielen soll
	 */
	private final Instruments instrument;
	/**
	 * Die Tonhöhe in welcher gespielt werden soll
	 */
	private final Tonhöhe tonhöhe;
	
	/**
	 * Hier wird ein neuer Ton erstellt
	 * @param instrument Das Instrument welches den Ton abspielen soll
	 * @param tonhöhe Die Tonhöhe in welcher gespielt werden soll
	 */
	public Note(Instruments instrument, Tonhöhe tonhöhe){
		this.instrument = instrument;
		this.tonhöhe = tonhöhe;
	}
	
	/**
	 * Welches Instrument spielt diesen Ton?
	 * @return Das Instrument welches den Ton abspielen soll
	 */
	public Instruments holeInstrument() {
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
