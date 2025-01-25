package models;

import java.util.List;

/**
 * Class for handling equal split expenses.
 */
public class EqualSplit extends Expense {

    // Constructor
    public EqualSplit(String id, User payer, double amount, List<User> participants) {
        super(id, payer, amount, participants);
    }

    // Implementing the calculateSplit method for equal split
    @Override
    public void calculateSplit() {
        double amountPerPerson = getAmount() / getParticipants().size();
        for (User participant : getParticipants()) {
            if (!participant.equals(getPayer())) {
                participant.updateBalance(amountPerPerson); // Adds balance to participant
                getPayer().updateBalance(-amountPerPerson); // Deducts from payer
            }
        }
    }

    @Override
    public String toString() {
        return "EqualSplit{id='" + getId() + "', payer=" + getPayer().getName() + ", amount=" + getAmount() + "}";
    }
}
