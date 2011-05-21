package instrumente;

import lied.Note;

public class Schlagzeug implements Instrument {

	@Override
	public void spieleNote(Note note) {
		// TODO Auto-generated method stub
		
	}

    @Override
    public Instruments getInstrument() {
        //TODO There are no "Drums". Select one of those:
//        return Instruments.BASS_DRUM;
//        return Instruments.SNARE_DRUM;
        return null;
    }

}
