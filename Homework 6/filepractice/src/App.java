//This is assuming you have your file in the correct directory, i included a reference of where your txt file should be in the brightspace assignment
//based off what we learned in class about files, you need to determine how it's best to read the text file included in the assignment 
//after you've read and kept track of the text, then i need you to figure out:
/*
1. what names had over a 3.5 gpa (using coding, of course, not your eyes)
2. how many names are there total?
*/
//here's the imports you will need to start, and i've left some code with some blanks for you to figure out
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //do you need something to start?
        File inputfile = new File("practice.txt");
        Scanner sc = new Scanner(inputfile);
        List<String> practiceList = new ArrayList<String>();
        List<String> nameList = new ArrayList<>();
        List<Double> gpaList = new ArrayList<>();
     
            while(sc.hasNext()){
                //what do we do at every line of the file?
                practiceList.add(sc.nextLine());
            }
        for (int i = 0;i < practiceList.size();i++){
            if (i % 2 == 0) {
                nameList.add(practiceList.get(i));
            } else {
                gpaList.add(Double.parseDouble(practiceList.get(i)));
            }
        }
      
      //optional if you want to keep this, just to show what the indices are of the list you created
        System.out.println("Number of names in the list: " + nameList.size());
        System.out.println("GPA List: " + gpaList);

    }
}
