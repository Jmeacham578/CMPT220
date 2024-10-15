import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DealOrNoDeal {
    Scanner scanner = new Scanner(System.in);
    public DealOrNoDeal() {}

    private ArrayList<Integer> initializeCases() {
        ArrayList<Integer> caseValues = new ArrayList<>();   
        ArrayList<Integer> remainingCases = new ArrayList<>(); 
        
        int[] values = {1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750, 1000, 5000, 
                        10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 
                        500000, 750000, 1000000};

        for (int value : values) {
            caseValues.add(value);
        }
        Collections.shuffle(caseValues); 
        for (int i = 1; i <= 26; i++) {
            remainingCases.add(i);
        }
        return caseValues; 
    }

    private int selectPlayerCase(ArrayList<Integer> caseValues, ArrayList<Integer> remainingCases) {
        System.out.println("Select your case (1-26): ");
        int playerCase = scanner.nextInt() - 1;
        int playerCaseValue = caseValues.get(playerCase);  
        remainingCases.remove(Integer.valueOf(playerCase + 1));  
        System.out.println("You selected case #" + (playerCase + 1));
        return playerCaseValue; 
    }

    private void openOtherCases(ArrayList<Integer> caseValues, ArrayList<Integer> remainingCases) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Select a case to open (from remaining cases): " + remainingCases);
            int caseToOpen = scanner.nextInt();
            if (!remainingCases.contains(caseToOpen)) {
                System.out.println("Case #" + caseToOpen + " has already been opened. Please pick another.");
                i--;  
            } else {
                int caseIndex = caseToOpen - 1;  
                System.out.println("Case #" + caseToOpen + " contains: $" + caseValues.get(caseIndex));
                remainingCases.remove(Integer.valueOf(caseToOpen));  
            }
        }
    }

    private void bankerOffer(int playerCaseValue) {
        int offer = playerCaseValue / 2;  
        System.out.println("The banker offers: $" + offer);
    }

    private boolean dealOrNoDeal() {
        System.out.println("Deal or No Deal? (1 for Deal, 2 for No Deal): ");
        int choice = scanner.nextInt();  
        if (choice == 1) {
            System.out.println("You took the deal! Game Over! Hope you had fun!");
            return true;  
        } else {
            return false; 
        }
    }

    private void revealPlayerCase(int playerCaseValue) {
        System.out.println("Your case contains: $" + playerCaseValue);
    }

    public void playGame() {
        ArrayList<Integer> caseValues = initializeCases();  
        ArrayList<Integer> remainingCases = new ArrayList<>();  
        for (int i = 1; i <= 26; i++) {  
            remainingCases.add(i);
        }
        int playerCaseValue = selectPlayerCase(caseValues, remainingCases);
        openOtherCases(caseValues, remainingCases);
        bankerOffer(playerCaseValue);
        if (dealOrNoDeal()) {
            System.out.println("You accepted the deal. Game over.");
        } else {
            System.out.println("No deal! Let's see what's in your case.");
            revealPlayerCase(playerCaseValue); 
        }
    }

    public static void main(String[] args) {
        DealOrNoDeal game = new DealOrNoDeal(); 
        game.playGame();  
    }
}




