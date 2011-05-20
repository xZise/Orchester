package lied;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Ein Lied besteht aus einem Takt und Tönen sowie einer Länge
 * @author Max
 *
 */
public class Lied {

	/**
	 * Der Takt des Liedes
	 */
	private Takt takt;
	
	/**
	 * Die Töne zugeordnet ihrer Zeit wann sie gespielt werden
	 */
	private HashMap<Taktzeit, LinkedList<Note>> noten;
	
	/**
	 * Die Länge des Liedes
	 */
	private Taktzeit maxZeit;
	
	/**
	 * Ein neues Lied
	 */
	public Lied (){
		noten = new HashMap<Taktzeit, LinkedList<Note>>();
		maxZeit = new Taktzeit(0);
	}
	
	/**
	 * Den Takt setzen
	 * @param takt der neue Takt
	 */
	public void setzeTakt(Takt takt) {
		this.takt = takt;
	}

	/**
	 * Welchen Takt hat das Lied?
	 * @return der Liedtakt
	 */
	public Takt holeTakt() {
		return takt;
	}
	
	/**
	 * Eine neue Note hinzufügen
	 * @param zeit die Zeit wann die Note gespielt werden soll
	 * @param note die Note die hinzufügt werden soll
	 */
	public void setzeNoten(Taktzeit zeit, Note note){
		
		if(maxZeit.holeZeit() < zeit.holeZeit()){
			maxZeit = zeit;
		}
		
		if(!noten.containsKey(zeit)){
			noten.put(zeit, new LinkedList<Note>());
		}
		noten.get(zeit).add(note);
	}
	
	/**
	 * Welche Noten werden zu dieser Zeit gespielt?
	 * @param zeit Der Zeitpunkt des Liedes
	 * @return die Noten die zu diesem Zeitpunkt gespielt werden
	 */
	public LinkedList<Note> holeNote(Taktzeit zeit){
		return noten.get(zeit);
	}
	
	/**
	 * Wie lang ist das Stück?
	 * @return die Zeitlänge des Stückes
	 */
	public Taktzeit holeMaxZeit(){
		return maxZeit;
	}
	
}
