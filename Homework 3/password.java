
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "password";
        System.out.println("What is the password?");
        String guess = sc.nextLine();

        while(!guess.equals(password)){
            System.out.println("Wrong password");
            guess = sc.nextLine();
        }
        System.out.println("Correct!");
        }
        
    }