# **Expense Manager**

## **Project Overview**

The **Expense Manager** is a Java-based application designed to help users manage and track shared expenses easily. This application allows users to create accounts, record expenses, and split those expenses among multiple participants. The main goal is to help people manage their shared costs, such as group outings, trips, or business expenses, and keep track of who owes whom and how much.

The system supports three different methods for splitting expenses:

1. **Equal Split** – The total expense is divided equally among all participants.
2. **Percentage Split** – The total expense is divided based on predefined percentages for each participant.
3. **Custom Split** – Each participant can pay a different amount, according to their choice.

The project is built using **Object-Oriented Programming (OOP)** principles, making the code modular, easy to understand, and easy to extend in the future.

---

## **Features**

- **User Management**: Create and manage users with unique IDs, names, and email addresses.
- **Expense Recording**: Create and record expenses with details like payer, total amount, and participants.
- **Flexible Expense Splitting**: Choose between three expense-splitting methods: equal split, percentage split, or custom split.
- **Balance Calculation**: After recording an expense, the system calculates the balances for each participant, showing how much they owe or are owed.
- **Dynamic Interaction**: The program allows dynamic input from the user, enabling the creation of multiple users, expenses, and balance checks.

---

## **How It Works**

The **Expense Manager** operates based on user inputs and predefined rules for splitting expenses. Here's a step-by-step explanation:

1. **Create a User**:  
   The user creates an account by providing a user ID, name, and email. Each user is stored in the system with a balance starting at 0.

2. **Create an Expense**:  
   The user can create an expense by providing details such as the payer’s ID, the total amount of the expense, and the number of participants. They can choose how the expense should be split among participants.

3. **Expense Splitting Methods**:
   - **Equal Split**: The total expense is divided equally among all participants.
   - **Percentage Split**: Users can specify what percentage of the expense each participant should pay.
   - **Custom Split**: Each participant can pay a custom amount for the expense.
   
4. **Balance Calculation**:  
   Once the expense is recorded, the system calculates the balance for each participant, showing who owes whom and how much.

---

## **Requirements**

To run this project, you need:

- **Java**: Version 8 or above.
- **IDE**: Eclipse, IntelliJ IDEA, or any Java IDE for coding and running the program.
- **Operating System**: Any platform (Windows, Mac, Linux) that supports Java.

---

## **Getting Started**

### **1. Clone the Repository**

To start using the **Expense Manager** project, you need to clone the repository to your local machine. You can do this by running the following command in your terminal:

git clone https://github.com/your-username/Expense-Manager.git

### **2. Open the Project in an IDE**

Open the project folder in your preferred Java IDE (like Eclipse, IntelliJ IDEA, etc.).

### **3. Compile and Run**

Once the project is open in the IDE, compile and run the **Main.java** file. Follow the prompts in the terminal to interact with the application. The menu will ask for input, such as creating users, entering expenses, and choosing how to split the expenses.

---

## **File Structure**

The project is organized as follows:

Expense-Manager/
│
├── src/
│   ├── ExpenseManager.java         # Main program file, handles the menu and user interaction
│   ├── User.java                  # Class for user management (ID, name, email, and balance)
│   ├── Expense.java               # Class for expense details (total amount, payer, participants)
│   ├── SplitStrategy.java         # Abstract class for expense splitting methods
│   ├── EqualSplit.java            # Class for equal split expense strategy
│   ├── PercentageSplit.java       # Class for percentage-based expense strategy
│   ├── CustomSplit.java           # Class for custom amount-based expense strategy
└── README.md                     # This file


---

## **Example Usage**

Here’s how the **Expense Manager** works:

1. **Create a User**  
   - User ID: 1  
   - Name: Charan  
   - Email: charanjeeth56@gmail.com  

2. **Create an Expense**  
   - Payer: Charan (ID 1)  
   - Total amount: 100  
   - Number of participants: 2  
   - Split Method: Equal Split (50 for each participant)  

3. **Display Balances**  
   - Charan's balance: 0 (Charan paid 100, no one owes him anything yet)

---

## **Possible Enhancements**

1. **Adding Persistent Storage**:  
   The current version of the application stores data in memory. Adding a database or file-based storage (like JSON or CSV) would allow data to persist between program runs.

2. **Multi-currency Support**:  
   The system can be extended to support multiple currencies, with the ability to convert expenses between different currencies.

3. **User Interface**:  
   A graphical user interface (GUI) can be added using JavaFX or Swing, making it more user-friendly.

4. **Detailed Reports**:  
   Implementing detailed reports for users, such as generating summary reports of all expenses and balances, could be a useful feature.

---

## **Conclusion**

The **Expense Manager** is an easy-to-use, flexible application for managing shared expenses. With its ability to handle different expense splitting strategies and the use of object-oriented principles, it offers a scalable solution for personal, business, or group expense tracking. Future improvements and enhancements can be added to make it more powerful and user-friendly.


