import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Level1 {
    public static void intro() {
        System.out.println("You ride for a while until you see a rundown village, you make your way to the tavern called 'The Silver Dragon'.");
        System.out.println("Under the Inn's sign, you see it says 'Established 1363'");
        System.out.println("You see the Barkeep at the counter, and notice he has a name tag: 'Wrynn'");
        System.out.println("You ask the barkeep about the sword handle, and he says he'll give it to you if you can answer 3 questions right");

    }
    public static boolean tavernQuiz() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        
        System.out.println("Barkeep: What's the name of this very establishment?");
        while (attempts > 0) {
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("The Silver Dragon")) {
                System.out.println("Barkeep: That's right, now let's see if that was skill or luck. Time for question 2!");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Barkeep: Now that wasn't right, I'll give you another chance (" + attempts + " attempts left)");
                } else {
                    System.out.println("Barkeep: All out of tries");
                    return false;
                }
            
            }
        }

        System.out.println(" ");

        System.out.println("Barkeep: What year did this place open?");
        while (attempts > 0) {
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("1363")) {
                System.out.println("Barkeep: You're doing pretty well kid, let's see if you can get Question 3!");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Barkeep: Now that wasn't right, I'll give you another chance (" + attempts + " attempts left)");
                } else {
                    System.out.println("Barkeep: All out of tries");
                    return false;
                }
            
            }
        }

        System.out.println(" ");

        System.out.println("Barkeep: What's my name?");
        while (attempts > 0) {
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Wrynn")) {
                System.out.println("Barkeep: Congratulations my traveling friend! You've got all three questions!");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Barkeep: Now that wasn't right, I'll give you another chance (" + attempts + " attempts left)");
                } else {
                    System.out.println("Barkeep: All out of tries");
                    return false;
                }
            
            }
        }
        
        System.out.println("Barkeep: Well, you beat my challenge, which means I outta be giving you that sword handle, shouldn't I? \n Here ya go! Good luck on your adventure friend, seems like yer gonna need it!");
        
        System.out.println(" ");
        return true;
    }
    public static void note2() {
        try {
            File inputFile = new File("Note2.txt");
            Scanner fileReader = new Scanner(inputFile);
            
            System.out.println("You leave the village with the handle in your pouch, as you ride down the road a courier catches up with you and hands you another note");
            System.out.println("The note says: ");
            System.out.println(" ");

            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("The note couldn't be found");
        }
        System.out.println(" ");
    
    }
 }


