import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.theory.ChordProgression;

public class Chords {
    public static void main(String[] args) {
        Player player = new Player();

        ChordProgression chord1 = new ChordProgression("I");
        ChordProgression progression = new ChordProgression("I ii V I");

        Pattern pattern = new Pattern(chord1.eachChordAs("$0e $1e $2e $1e $0e").setKey("AMAJ"));
        pattern.repeat(2);

        Pattern pattern2 = new Pattern(progression.setKey("AMAJ"));

        player.play(pattern.setTempo(100));
        player.play(pattern2.setInstrument("Flute").setTempo(60));

    }
}