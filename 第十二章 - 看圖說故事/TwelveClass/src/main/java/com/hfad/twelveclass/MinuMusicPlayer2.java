package com.hfad.twelveclass;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MinuMusicPlayer2 implements ControllerEventListener
{
    public static void main(String args[])
    {
        MinuMusicPlayer2 mini = new MinuMusicPlayer2();
        mini.go();
    }

    public void go()
    {
        try
        {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(this, eventsIWant);

            Sequence seq = new Sequence(Sequence.PPQ , 4);
            Track track = seq.createTrack();

            for(int i = 5 ; i < 129 ; i += 4)
            {
                track.add(makeEvent( 144 , 1 , i , 100 , i ));
                track.add(makeEvent( 176 , 1 , 127 , 0 , i ));
                track.add(makeEvent( 128 , 1 , i , 100 , i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    @Override
    public void controlChange(ShortMessage shortMessage)
    {
        System.out.println("la");
    }

    public static MidiEvent makeEvent(int comd , int chan , int one , int two , int tick)
    {
        MidiEvent event = null;
        try
        {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd , chan , one , two);
            event = new MidiEvent(a , tick);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return event;
    }
}
