import java.util.Scanner;

public class negnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int userNumber = sc.nextInt();
        int sum = 0;
        
        // until user number is negative
        while(userNumber >= 0){
            sum += userNumber;
            System.out.println("Enter again");
            userNumber = sc.nextInt();
        }
        System.out.println(sum);
        }
        
    }