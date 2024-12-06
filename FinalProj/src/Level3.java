import java.util.Scanner;
import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class Level3 {
    public static void start() {
        System.out.println("After reforging the Sword, you ride for hours until you reach the castle, you race through the gate to find the Wizard waiting for you in the courtyard. Beside them, they have your \nBenefactor chained up on the ground. You unsheathe the Sword of Destiny and prepare to fight!");
}

    public static boolean wizardFight(){ 
        int playerHealth = 200;
        int wizardHealth = 200;

        Queue<String> turnQueue = new LinkedList<>();
        turnQueue.add("Player");
        turnQueue.add("Wizard");

        Queue<String> wizardAttack = new LinkedList<>();
        wizardAttack.add("The Wizard attacks for 40 damage!");
        wizardAttack.add("The Wizard uses fireball for 50 damage!");

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Player Health: " + playerHealth + ", Wizard Health: " + wizardHealth);

        while (playerHealth > 0 && wizardHealth > 0) {
            String currentTurn = turnQueue.poll();

            if ("Player".equals(currentTurn)) {
                System.out.println("\nChoose an attack:");
                System.out.println("1. Destiny Strike (-50 HP)");
                System.out.println("2. Destiny Slash ( -20 HP)");
                System.out.println("3. Destiny Chop (-45 HP)");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.println("You use 'Destiny Strike' against the Wizard!");
                        wizardHealth -= 50;
                    }
                    case 2 -> {
                        System.out.println("You use 'Destiny Slash' against the Wizard!");
                        wizardHealth -= 20;
                    }
                    case 3 -> {
                        System.out.println("You use 'Destiny Chop' against the Wizard!");
                        wizardHealth -= 45;
                    }
                    default -> {
                        System.out.println("Invalid choice! You lose your turn.");
                    }
                }
            } else if ("Wizard".equals(currentTurn)) {
                String wizardAction = wizardAttack.poll();
                if (wizardAction != null) {
                    System.out.println("\n" + wizardAction);
                    if (wizardAction.contains("40 damage")) {
                        playerHealth -= 40;
                    } else if (wizardAction.contains("50 damage")) {
                        playerHealth -= 50;
                    }
                    wizardAttack.add(wizardAction); 
                }
            }

            System.out.println("\nPlayer Health: " + playerHealth + ", Wizard Health: " + wizardHealth);

            turnQueue.add(currentTurn);
        }

        if (playerHealth <= 0) {
            System.out.println("\nYou have been defeated by the Wizard!");
            return false;
        } else if (wizardHealth <= 0) {
            System.out.println("\nYou defeated the Wizard! Victory!");
            return true;
        }
        scanner.close();
        return false;

        
    }
}



