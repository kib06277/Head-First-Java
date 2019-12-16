package com.hfad.elevenclass;
import javax.sound.midi.*;
public class MiniMiniMusicApp
{
    public static void main(String[] args)
    {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play()
    {
        try
        {
            // make (and open) a sequencer, make a sequence and track
            //取得 Sequencer 並將她打開
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            // now make two midi events (containing a midi message)
            // 執行兩個 midi 事件(包含 midi 消息)
            MidiEvent event = null;

            // first make the message
            // then stick the message into a midi event
            // and add the event to the track
            //首先發出消息
            //然後將消息粘貼到midi事件中
            //並將事件添加到軌道
            ShortMessage a = new ShortMessage(); //建構 Message
            a.setMessage(144, 1, 44, 100); //置入指令
            MidiEvent noteOn = new MidiEvent(a, 1); // 以 Message 建構 MidiEvent
            track.add(noteOn); //將 MidiEvent 加入 Track 中

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16); // <-- means at tick one, the above event happens 表示在第一個勾時發生上述事件
            track.add(noteOff);

            // add the events to the track
            // add the sequence to the sequencer, set timing, and start
            sequencer.setSequence(seq);
            sequencer.start();

            // new
            Thread.sleep(1000);
            sequencer.close();
            System.exit(0);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    // close play
}
// close class