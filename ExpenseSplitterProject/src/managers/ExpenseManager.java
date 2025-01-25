package managers;

import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseManager {

    private List<User> users;
    private List<Expense> expenses;

    // Constructor
    public ExpenseManager() {
        users = new ArrayList<>();
        expenses = new ArrayList<>();
    }

    // Method to create a new user
    public void createUser() {
        User newUser = User.createUser();
        users.add(newUser);
        System.out.println("User created successfully: " + newUser);
    }

    // Method to create a new expense
    public void createExpense() {
        Scanner scanner = new Scanner(System.in);

        // Select payer
        System.out.println("Select Payer: ");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(i + 1 + ". " + users.get(i).getName());
        }
        int payerIndex = scanner.nextInt() - 1;
        User payer = users.get(payerIndex);

        // Enter the amount
        System.out.print("Enter the total amount: ");
        double amount = scanner.nextDouble();

        // Select participants
        System.out.print("Enter number of participants: ");
        int numParticipants = scanner.nextInt();
        List<User> participants = new ArrayList<>();
        participants.add(payer); // Always add the payer to the participants list
        System.out.println("Select Participants (excluding the payer): ");
        for (int i = 0; i < users.size(); i++) {
            if (i != payerIndex) {
                System.out.println(i + 1 + ". " + users.get(i).getName());
            }
        }

        // Add participants
        for (int i = 0; i < numParticipants; i++) {
            System.out.print("Enter participant index: ");
            int participantIndex = scanner.nextInt() - 1;
            if (participantIndex != payerIndex) {  // Ensure the participant is not the payer
                participants.add(users.get(participantIndex));
            }
        }

        // Choose split type
        System.out.println("Select Split Type: ");
        System.out.println("1. Equal Split");
        System.out.println("2. Percentage Split");
        System.out.println("3. Custom Split");
        int splitChoice = scanner.nextInt();

        // Create expense based on split choice
        Expense expense = null;
        switch (splitChoice) {
            case 1:
                expense = new EqualSplit("EXP" + (expenses.size() + 1), payer, amount, participants);
                break;
            case 2:
                expense = new PercentageSplit("EXP" + (expenses.size() + 1), payer, amount, participants);
                break;
            case 3:
                expense = new CustomSplit("EXP" + (expenses.size() + 1), payer, amount, participants);
                break;
            default:
                System.out.println("Invalid option.");
                return;
        }

        // Add expense and calculate split
        expenses.add(expense);
        expense.calculateSplit();
        System.out.println("Expense created and split successfully: " + expense);
    }


    // Method to display user balances
    public void displayBalances() {
        System.out.println("\nUser Balances: ");
        for (User user : users) {
            System.out.println(user.getName() + ": " + user.getBalance());
        }
    }

    // Main menu to interact with the system
    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nExpense Manager Menu:");
            System.out.println("1. Create User");
            System.out.println("2. Create Expense");
            System.out.println("3. Display Balances");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    createExpense();
                    break;
                case 3:
                    displayBalances();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        manager.mainMenu();
    }
}
