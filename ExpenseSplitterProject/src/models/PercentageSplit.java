package models;

import java.util.List;
import java.util.Scanner;

/**
 * Class for handling percentage-based split expenses.
 */
public class PercentageSplit extends Expense {

    // Constructor
    public PercentageSplit(String id, User payer, double amount, List<User> participants) {
        super(id, payer, amount, participants);
    }

    // Implementing the calculateSplit method for percentage split
    @Override
    public void calculateSplit() {
        Scanner scanner = new Scanner(System.in);
        double remainingAmount = getAmount();

        for (User participant : getParticipants()) {
            if (!participant.equals(getPayer())) {
                System.out.print(participant.getName() + ", enter your percentage: ");
                double percentage = scanner.nextDouble();
                double amountDue = (percentage / 100) * getAmount();

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
        return "PercentageSplit{id='" + getId() + "', payer=" + getPayer().getName() + ", amount=" + getAmount() + "}";
    }
}
