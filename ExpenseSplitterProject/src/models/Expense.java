package models;

import java.util.List;

/**
 * Abstract class representing an expense.
 */
public abstract class Expense {
    private String id;
    private User payer;
    private double amount;
    private List<User> participants;

    // Constructor
    public Expense(String id, User payer, double amount, List<User> participants) {
        this.id = id;
        this.payer = payer;
        this.amount = amount;
        this.participants = participants;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getPayer() {
        return payer;
    }

    public void setPayer(User payer) {
        this.payer = payer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    // Abstract method to be implemented by subclasses for calculating the split
    public abstract void calculateSplit();

    // Display expense details
    @Override
    public String toString() {
        return "Expense{id='" + id + "', payer=" + payer.getName() + ", amount=" + amount + ", participants=" + participants + "}";
    }
}
