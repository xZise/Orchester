package lied;

import instrumente.Instrument;

public class Note {
	
	private final Instrument instrument;
	private final Tonhöhe tonhöhe;
	
	public Note(Instrument instrument, Tonhöhe tonhöhe){
		this.instrument = instrument;
		this.tonhöhe = tonhöhe;
	}
	
	public Instrument holeInstrument() {
		return instrument;
	}

	public Tonhöhe holeTonhöhe() {
		return tonhöhe;
	}

}
