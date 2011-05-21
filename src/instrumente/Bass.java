package instrumente;

import lied.Note;

public class Bass implements Instrument {

	@Override
	public void spieleNote(Note note) {
		// TODO Auto-generated method stub
		
	}

    @Override
    public Instruments getInstrument() {
        //TODO: Which bass? Guitar or Drums?
//        return Instruments.BASS_GUITAR; //See also: Gitarre class
//        return Instruments.BASS_DRUM; // See also Schlagzeug class
        return null;
    }

}
