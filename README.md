# Banking Service

This project implements the core functions of a simple banking system in Java. It allows users to:

- Deposit money
- Withdraw money
- Print a statement of all transactions

## Features
- Exception handling for invalid inputs (e.g., negative amounts, insufficient funds)
- In-memory storage of transactions using ArrayLists
- Simple and efficient logic for banking operations

## How to Run
1. Ensure you have Java 17+ and Maven installed.
2. Compile and run the project using Maven:
   ```sh
   mvn clean compile exec:java -Dexec.mainClass=ma.skypay.Main
   ```
3. The program will execute a sample scenario and print the bank statement to the console.

## Project Structure
- `AccountService`: Interface defining deposit, withdraw, and printStatement methods.
- `AccountServiceImpl`: Implements the banking logic.
- `Transaction` and `TransactionType`: Represent individual transactions and their types.
- `Main`: Entry point for running the sample scenario. 