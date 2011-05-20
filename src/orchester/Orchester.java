package orchester;

import java.util.LinkedList;

import lied.Lied;
import instrumente.Instrument;

public class Orchester {
	
	private LinkedList<Instrument> instrumente;
	
	public Orchester(){
		instrumente = new LinkedList<Instrument>();
	}

	public void hinzufügenInstrument(Instrument instrument) {
		instrumente.add(instrument);
	}

	public void liedAbspielen(Lied lied) {
		
	}

	public void setzeAlternativeInstrument(Instrument orginal,
			Instrument alternative) {

	}

}
