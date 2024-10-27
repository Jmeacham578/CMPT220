/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

import java.util.Scanner;
class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a dogs name: ");
        String petname = sc.nextLine();
        
        System.out.println("How old is your dog: ");
        int age = sc.nextInt();
        dogNameAndAge(petname, age);
        
    }
    public static String name(String x){
        return x;
    }
    public static int dogAge(int y){
        return(y * 7);
    }
    public static void dogNameAndAge(String x, int y){
        System.out.println("Your dog's name is " + x + ", and they are " + y + " years old, which is " + dogAge(y) + " in dog years!");
    }
}