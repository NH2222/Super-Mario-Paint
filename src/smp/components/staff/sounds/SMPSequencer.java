package smp.components.staff.sounds;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Synthesizer;

import smp.SoundfontLoader;

/**
 * The Super Mario Paint Sequencer. It holds the sequence of notes
 * that is to be played back to the user.
 * @author RehdBlob
 * @since 2012.08.24
 */
public class SMPSequencer {

    /**
     * The number of tracks that are to be sequenced.
     */
    private static int NUM_TRACKS = 19;

    /**
     * The number of tracks that are to be sequenced (Advanced Mode).
     */
    private static int NUM_TRACKS_ADV = 50;

    /**
     * The MIDI Sequencer that will be used to hold MIDI Events.
     */
    private Sequencer theSequencer;

    /**
     * The song that is to be played, displayed on the staff.
     */
    private SMPSequence theSong;

    /**
     * The arrangement that is to be played, displayed on the staff.
     */
    private SMPSequence theArrangement;

    /**
     * A Synthesizer object reference that will be used to generate sound.
     */

    private Synthesizer theSynthesizer;

    /**
     * Initializes the sequencer and its dependencies.
     */
    public SMPSequencer() {
        try {
            theSequencer = MidiSystem.getSequencer();
            theSong = new SMPSequence();
            theArrangement = new SMPSequence();
            theSynthesizer = SoundfontLoader.getSynth();
        } catch (MidiUnavailableException e) {
            // Probably can't recover from this since if you can't get a
            // sequencer, you can't make long sequences of sound.
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            // Not likely to recover from this either if the sequence
            // creation fails.
            e.printStackTrace();
        }
    }

    /**
     * Adds some note into the sequence of notes that we're working with.
     */
    public void addNote() {

    }

    /**
     * Removes a note from the sequence of notes that we're working with.
     */
    public void removeNote() {

    }

    /**
     * @param BPM The beats per minute that we're intending to set the sequencer
     * to run at.
     */
    public void setTempo(float BPM) {
        theSequencer.setTempoInBPM(BPM);
    }



    /**
     * Adds a MidiEvent onto the song sequence.
     */
    public void addSongMessage(MidiEvent e) {


    }

    /**
     * Removes a MidiEvent from the song sequence.
     */
    public void removeSongMessage(MidiEvent e) {


    }

}
