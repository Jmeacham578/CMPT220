import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Intro {
    public static void start() {
        try {
            File inputFile = new File("Note.txt");
            Scanner fileReader = new Scanner(inputFile);
            
            System.out.println("You awaken in a forest, covered in dirt and mud. In your pocket you find a hastily written note.");
            System.out.println("It reads: ");

            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("The note couldn't be found");
        }
        System.out.println(" ");

        System.out.println("You make your way out of the forest, and find yourself a horse.");
        System.out.println("You head towards the nearby village.");
        System.out.println(" ");
        

}
}
