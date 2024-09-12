//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        //Intro
        System.out.println("Welcome to my quiz about the Stormlight Archives!");

        //Question 1
        System.out.println("What is the name of the first book in the Stormlight Archive? ");
        System.out.println("a. Rhythm of War");
        System.out.println("b. The Way of Kings");
        System.out.println("c. Words of Radiance");
        String Q1 = sc.nextLine().toLowerCase();
        if (Q1.equals("b")) {
            System.out.println("Correct");
            score++;
        } else {
            System.out.println("Sorry, that wasn't the right answer.");
        }
        System.out.println("Your score is " + score);

        //Question 2
        System.out.println("What character is given the title 'Stormblessed?'");
        System.out.println("a. Dalinar");
        System.out.println("b. Szeth");
        System.out.println("c. Kaladin");
        String Q2 = sc.nextLine().toLowerCase();
        if (Q2.equals("c")) {
            System.out.println("Correct");
            score++;
        } else {
            System.out.println("Sorry, that wasn't the right answer.");
        }
        System.out.println("Your score is " + score);

        //Question 3
        System.out.println("Who betrayed the Kholin's on the Shattered Plains?");
        System.out.println("a. Amaram");
        System.out.println("b. Thanadal");
        System.out.println("c. Sadeas");
        String Q3 = sc.nextLine().toLowerCase();
        if (Q3.equals("c")) {
            System.out.println("Correct");
            score++;
        } else {
            System.out.println("Sorry, that wasn't the right answer.");
        }
        System.out.println("Your score is " + score);

        if (score == 3) {
            System.out.println("Congrats on getting all 3 correct!");
        } else { 
            System.out.println("You didn't get all 3, better luck next time!");
        }
        
    }
}


