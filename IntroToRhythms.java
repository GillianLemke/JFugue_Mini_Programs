import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

public class IntroToRhythms {
    public static void main(String[] args) {
        Rhythm rhythm = new Rhythm()
                .addLayer("O...O...O...O...")
                .addLayer("..S...S...S...S.")
                .addLayer("````````````````");
        new Player().play(rhythm.getPattern().repeat(2));
    }
}