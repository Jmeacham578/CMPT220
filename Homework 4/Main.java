import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       List<Integer> numList = new ArrayList<Integer>();
       (numList).add(3);
       (numList).add(8);
       (numList).add(10);
       (numList).add(6);
       (numList).add(2);

       int minValue = Collections.min(numList);
      
       System.out.println(minValue);
       }
    }
