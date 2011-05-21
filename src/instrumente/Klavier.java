package instrumente;

import lied.Note;

public class Klavier implements Instrument {

	@Override
	public void spieleNote(Note note) {
		// TODO Auto-generated method stub
		
	}

    @Override
    public Instruments getInstrument() {
        return Instruments.PIANO;
    }

}
