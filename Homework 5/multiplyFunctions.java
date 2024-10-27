import java.util.Scanner;
class multiplyFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the second value: ");
        int b = sc.nextInt();
        
        System.out.println("Enter the third value: ");
        int c = sc.nextInt();
        
        int result = multiply(a,b,c);
        System.out.println(result);
    }
    public static int multiply(int a, int b, int c){
        return(a*b*c);
    }
}
