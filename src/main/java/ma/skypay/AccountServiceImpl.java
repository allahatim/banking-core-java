package ma.skypay;

import ma.skypay.AccountService;
import ma.skypay.Transaction;
import ma.skypay.TransactionType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private final List<Transaction> transactions = new ArrayList<>();
    private int balance = 0;

    @Override
    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        transactions.add(new Transaction(LocalDate.now(), amount, balance, TransactionType.DEPOSIT));
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        transactions.add(new Transaction(LocalDate.now(), -amount, balance, TransactionType.WITHDRAWAL));
    }

    @Override
    public void printStatement() {
        System.out.println("DATE       | AMOUNT | BALANCE");
        List<Transaction> copy = new ArrayList<>(transactions);
        Collections.reverse(copy);
        for (Transaction t : copy) {
            System.out.printf("%s | %6d | %7d\n", t.getDate(), t.getAmount(), t.getBalance());
        }
    }
} 