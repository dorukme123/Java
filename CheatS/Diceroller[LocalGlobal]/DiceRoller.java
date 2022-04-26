package mypackage;
import java.util.Random;

public class DiceRoller {

    // or we can just declare everything outside the class.
    DiceRoller(){
        Random random = new Random();
        int number = 0;
        roll(random,number);
    }
    void roll(Random random, int number){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
