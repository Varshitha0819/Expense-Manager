package models;

import java.util.Scanner;

/**
 * Represents a user in the expense management system.
 */
public class User {
    private String id;
    private String name;
    private String email;
    private double balance;

    // Constructor
    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balance = 0.0;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Update balance (add or subtract)
    public void updateBalance(double amount) {
        this.balance += amount;
    }

    // Display user details
    @Override
    public String toString() {
        return "User{id='" + id + "', name='" + name + "', email='" + email + "', balance=" + balance + "}";
    }

    // Method to take input dynamically for user details
    public static User createUser() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter User Email: ");
        String email = scanner.nextLine();
        
        return new User(id, name, email);
    }
}
