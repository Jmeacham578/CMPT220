import java.util.Scanner;
class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What grade did you get on the test (Give in 10's): ");
        int grade = sc.nextInt();
        switch (grade){
            case 100:
            case 90:
                System.out.println("You got an A!");
                break;
            case 80:
                System.out.println("You got an B!");
                break;
            case 70:
                System.out.println("You got an C!");
                break;
            case 60:
                System.out.println("You got an D!");
                break;
            case 50:
            case 40:
            case 30:
            case 20:
            case 10:
                System.out.println("You got an F!");
                break;
            default:
                System.out.println("Invalid input");
        }
        }
}