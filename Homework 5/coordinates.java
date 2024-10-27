import java.util.Scanner;
class coordinates {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Give me an X coordinate: ");
       int xcord = sc.nextInt();
       
       System.out.println("Give me a Y coordinate: ");
       int ycord = sc.nextInt();
       
       coords(xcord, ycord);
       
    }
    public static void coords(int x, int y){
        System.out.println("Your coordinates are: ("+ x +","+ y +")");
    }
}