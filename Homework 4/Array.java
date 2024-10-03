
/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */
import java.util.Collections;
public class Array {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
        int[] check = new int[myArray.length];
        //you cannot use the array util. Do this one by hand :(
        for (int i = 0; i < myArray.length; i++) {
            if (check[i] == 1){
                continue;
            }
            int dupeCount = 1;
            for (int j = i + 1;j < myArray.length;j++){
                if (myArray[i] == myArray[j]) {
                    dupeCount++;
                    check[j] = 1;
            }
        }
        if (dupeCount > 1){
            System.out.println("Duplicate found: " + myArray[i] + " shows up " + dupeCount + " times");
            check[i] = 1;
        }
            }
        }
    }

