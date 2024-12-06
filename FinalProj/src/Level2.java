import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Level2 {
    static int  cyclopsHealth = 3;
    public static void start() {
        System.out.println("You ride for days along the eastern road. Eventually you start to pass people traveling in the other direction.");
        System.out.println("You stop one of them and ask where they're all going, they tell you that everyone is terrified of the cyclops in the cave, \nand are fleeing to a local castle. ");
        System.out.println("You speed down the road towards the cave");
}

public static boolean cyclopsEncounter() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("You enter the cave and see the Cyclops eating a dead goat, blood running down it's mouth");
    System.out.println("The Cyclops roars and stands to attack you!");

    while (Main.playerHealth > 0 && cyclopsHealth > 0) {
        System.out.println("\nYour health: " + Main.playerHealth);
        System.out.println("Cyclops health: " + cyclopsHealth);
        System.out.println("What will you do? (1. Jab, 2. Heavy Slash, 3. Chop) (Answer with the #)");
        
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You jabbed at the Cyclops and hit him!");
                takeDamage("boss", 1);
                    break;
            case 2:
                System.out.println("You slashed at the Cyclops and hit him!");
                takeDamage("boss", 2);
                break;
            case 3:
                System.out.println("You chopped at the Cyclops and hit him!");
                takeDamage("boss", 1);
                break;
            default:
                System.out.println("Invalid choice. You lose your turn!");
        }
        if (cyclopsHealth > 0) {
            System.out.println("The Cyclops swings its massive club at you!");
            takeDamage("player", 2);  
        }
    }
    if (Main.playerHealth <= 0) {
        System.out.println("You have been defeated by the Cyclops. Game over.");
        return false;
    } else if (cyclopsHealth <= 0) {
        System.out.println("You killed the Cyclops! As his body drops to the floor something falls from his trousers and clatters at your feet, \nyou pick it up and realize that it's the other half of the Sword of Destiny!");
        System.out.println(" ");
        return true;
    }
    return false;
    
}

public static void takeDamage(String target, int damage) {
    if (target.equalsIgnoreCase("player")) {
        Main.playerHealth -= damage; 
        if (Main.playerHealth < 0) Main.playerHealth = 0; 
        System.out.println("You take " + damage + " damage. Your health is now " + Main.playerHealth + ".");
    } else if (target.equalsIgnoreCase("boss")) {
        cyclopsHealth -= damage;
        if (cyclopsHealth < 0) cyclopsHealth = 0; 
        System.out.println("The Cyclops takes " + damage + " damage. Its health is now " + cyclopsHealth + ".");
    } else {
        System.out.println("Invalid target for damage.");
    }
}

public static void note3() {
        try {
            File inputFile = new File("Note3.txt");
            Scanner fileReader = new Scanner(inputFile);
            
            System.out.println("You leave the Cyclop's lair and get on your horse, and start heading down the road. As you ride, \n a falcon swoops down from the sky and drops a note in your hands");
            System.out.println("The note says: ");
            System.out.println(" ");

            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("The note couldn't be found");
        }
        System.out.println(" ");
}

public static void swordForge() {
    System.out.println("You ride for hours until you find a blacksmith who can help you reforge the sword. You give him the two \npieces of the Sword of Destiny and he puts the two together, mending the Mythical sword. Now you can head to the castle and kill the Wizard, ending his threat! ");
}
}