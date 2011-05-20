package lied;

public class Takt {

	private int zeiteinheiten;
	
	/**
	 * Erstellt einen Takt
	 * @param zeiteinheiten die Zeiteinheiten die gewartet werden soll
	 */
	public Takt(int zeiteinheiten){
		this.zeiteinheiten = zeiteinheiten;
	}
	
	public Taktzeit weiter() {
		return (new Taktzeit(this.zeiteinheiten));
	}

}
