import java.util.Scanner;

public class LoopsDebug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DONE
        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //DONE
        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        //here's a hint
        for (int i = 1; i < num; i++){
            fact *= i;
        }
        System.out.println("Factorial of " + num + "=" + fact);

        //DONE
        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?
        int num2 = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num2; i += 2) {
            sum = sum + i;
        }
        System.out.println("The sum of the numbers is: " + sum);




        //DONE
        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;
        }


        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        //hint
        System.out.println("Enter a word: ");
        String original = sc.nextLine();

        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed word: " + reversed); 


    }
}
