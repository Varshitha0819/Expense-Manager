package models;

import java.util.List;
import java.util.Scanner;

/**
 * Class for handling custom split expenses.
 */
public class CustomSplit extends Expense {

    // Constructor
    public CustomSplit(String id, User payer, double amount, List<User> participants) {
        super(id, payer, amount, participants);
    }

    // Implementing the calculateSplit method for custom split
    @Override
    public void calculateSplit() {
        Scanner scanner = new Scanner(System.in);
        double remainingAmount = getAmount();

        for (User participant : getParticipants()) {
            if (!participant.equals(getPayer())) {
                System.out.print(participant.getName() + ", enter the amount you will pay: ");
                double amountDue = scanner.nextDouble();

                if (remainingAmount >= amountDue) {
                    participant.updateBalance(amountDue); // Adds balance to participant
                    getPayer().updateBalance(-amountDue); // Deducts from payer
                    remainingAmount -= amountDue;
                } else {
                    System.out.println("Not enough remaining balance for " + participant.getName());
                }
            }
        }
    }

    @Override
    public String toString() {
        return "CustomSplit{id='" + getId() + "', payer=" + getPayer().getName() + ", amount=" + getAmount() + "}";
    }
}
