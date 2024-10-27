import java.util.Scanner;
class petName {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       petName();
       System.out.println("Enter your pets name: ");
       String name = sc.nextLine();
       otherPetName(name);
    }
    public static void petName(){
        System.out.println("My pet's name is Leo, what's yours?");
    }
    public static void otherPetName(String x){
        System.out.println("Your pet's name is " + x);
    }
}