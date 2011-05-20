package lied;

import java.util.LinkedList;

public class Lied {

	private Takt takt;

	public void setzeTakt(Takt takt) {
		this.takt = takt;
	}

	public Takt holeTakt() {
		return takt;
	}
	
	public void setzeNoten(Taktzeit zeit, Note note){
		
	}
	
	public LinkedList<Note> holeNote(Taktzeit zeit){
		return null;
	}
	
}
