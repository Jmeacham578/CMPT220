import java.util.Scanner;

class drinkOrNah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = sc.nextInt();

        String result = (age >= 21)?("You can drink"):("You cannot drink");
        System.out.println(result);
    }
}