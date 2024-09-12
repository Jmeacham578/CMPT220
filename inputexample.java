import java.util.Scanner;
class Helloworld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your  first name? ");
        String firstname = sc.nextLine();
        
        System.out.println("What is your last name? ");
        String lastname = sc.nextLine();

        System.out.println("Hello, " + firstname + " " + lastname + "!");
        
    }
}