import java.util.Scanner;

public class agecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");

        int age = sc.nextInt();
        if(age >= 25){
            System.out.println("You can drink & rent a car!");
        } else if (age >= 21 && age <= 25){ 
            System.out.println("You can drink but not rent a car!");
        } else if (age <= 21 && age >= 18){
            System.out.println("You can smoke but not drink or rent a car!");
        } else {
            System.out.println("You can only have soda");
        }
    }
}