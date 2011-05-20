package lied;

import instrumente.Instrument;
import instrumente.Klavier;

public class Note {
	
	private final Instrument instrument;
	private final Tonhöhe tonhöhe;
	
	public Note(Instrument instrument, Tonhöhe tonhöhe){
		if(instrument == null){
			instrument = new Klavier();
		}
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
