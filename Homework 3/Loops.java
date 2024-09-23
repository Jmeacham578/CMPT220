/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a word: ");
        String word = sc.nextLine();
        for(int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

    }
}
// I figured out how to do this through looking up how to print out each individual letter of a given string
// the user has to first give the program a word, which is stored as a string, and then in the for loop it checks every character in the string and prints each letter as an individual line
// i picked the for loop conditional so that it counted each letter in the string and increased by 1 until it reached the end of the string