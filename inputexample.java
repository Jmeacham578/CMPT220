import java.util.Scanner;
class Helloworld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        String input = sc.nextLine();
        System.out.println(input);
    }
}