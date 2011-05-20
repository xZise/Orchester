package lied;

public class Taktzeit {


	private int zeit;

	/**
	 * Erstellt eine neue Zeit
	 * @param zeit die Zeitdauer
	 */
	public Taktzeit(int zeit) {
		this.zeit = zeit;
	}
	
	/**
	 * Setzt eine Zeit
	 */
	public void setzeZeit(int zeit) {
		this.zeit = zeit;
	}

	/**
	 * Gibt einen Zeitabschnitt an
	 */
	public int holeZeit() {
		return zeit;
	}

	/**
	 * Geht im Takt weiter
	 */
	public void weiter(Taktzeit weiter) {
		this.zeit += weiter.holeZeit();

	}

}
