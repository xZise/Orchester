package lied;

import instrumente.Instrument;

public class Note {
	
	private Instrument instrument;
	private Tonhöhe tonhöhe;

	public void setzeInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public Instrument holeInstrument() {
		return instrument;
	}

}
