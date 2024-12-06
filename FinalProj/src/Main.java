import java.util.Scanner;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int playerHealth = 3;
    public static void main(String[] args) throws Exception {
        boolean game = true;
        while(game){
            playerHealth = 3;
            variables.death1 = false;
            variables.death2 = false;
            variables.death3 = false;

            Intro.start();

            Level1.intro();
            if(!Level1.tavernQuiz()){
            System.out.println("You failed the tavern quiz. Restarting the game");
            System.out.println(" ");
            continue;
            }
            Level1.note2();
  
            Level2.start();
            if (!Level2.cyclopsEncounter()){
                System.out.println("Restarting the game");
                System.out.println(" ");
                continue;
            }
            Level2.note3();
            Level2.swordForge();

            Level3.start();
            if (!Level3.wizardFight()){
                System.out.println("Restarting the game");
                System.out.println(" ");
                continue;
            }

            System.out.println("Congratulations! You've beaten the game!");
            game = false;


        }
    }
}
