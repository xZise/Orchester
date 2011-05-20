package lied;

import java.util.HashMap;
import java.util.LinkedList;

public class Lied {

	private Takt takt;
	
	private HashMap<Taktzeit, LinkedList<Note>> noten;
	
	private Taktzeit maxZeit;
	
	public Lied (){
		noten = new HashMap<Taktzeit, LinkedList<Note>>();
		maxZeit = new Taktzeit();
	}
	

	public void setzeTakt(Takt takt) {
		this.takt = takt;
	}

	public Takt holeTakt() {
		return takt;
	}
	
	public void setzeNoten(Taktzeit zeit, Note note){
		
		if(maxZeit.holeZeit() < zeit.holeZeit()){
			maxZeit = zeit;
		}
		
		if(!noten.containsKey(zeit)){
			noten.put(zeit, new LinkedList<Note>());
		}
		noten.get(zeit).add(note);
	}
	
	public LinkedList<Note> holeNote(Taktzeit zeit){
		return noten.get(zeit);
	}
	
	public Taktzeit holeMaxZeit(){
		return maxZeit;
	}
	
}
