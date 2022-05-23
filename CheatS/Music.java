import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        // music = music player
        Scanner scanner = new Scanner(System.in);
        File file = new File("src/sound.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = scanner.next();
        while(!response.equals("q")){
            System.out.println("p play, s stop, r reset, q quit");
            switch(response){
                case ("p"):
                    clip.start();
                    break;
                case ("s"):
                    clip.stop();
                    break;
                case ("r"):
                    clip.setMicrosecondPosition(0);
                    break;
            }
        }
        clip.start();



    }
}
