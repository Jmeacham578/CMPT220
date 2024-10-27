/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class debugFunctions {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    //Problem 2
    System.out.println("enter # ill fact");
       int factorial = sc.nextInt();
       problem2(factorial);
       System.out.println(problem2(factorial));

    // Problem 3
    System.out.println("Enter a number and I will tell you the sum of every other number: ");
    int sum2 = sc.nextInt();
    problem3(sum2);
    System.out.println(problem3(sum2));

    sc.nextLine();

    // Problem 5
    System.out.println("Give me a word and I'll give you the reverse of it: ");
    String original = sc.nextLine();
    reverseWord(original);
    System.out.println(reverseWord(original)); 

    
      
    }

    public static int problem2(int num) {
        int fact = 1;
           for (int i = 1; i <= num; i++){
           fact *= i;
       }
       return fact;
       }
    
    public static int problem3(int num2){
        int sum = 0;
        for (int i = 1; i < num2; i += 2) {
            sum = sum + i;
    }
    return sum;
    }  

    public static String reverseWord(String word){
        return new StringBuilder(word).reverse().toString();
    }

    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }

  
    public static void printDog(){
        System.out.println("Dog");
    }

  
}
