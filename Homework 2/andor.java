import java.util.Scanner;

public class andor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = -1;
        if (n1 > 5) {
            System.out.println("too big");
        } else if (n1 > 0 && n1 < 5 ){
            System.out.println("just right");
        } else {
            System.out.println("too small!");
        }
    }
}