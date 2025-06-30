package ma.skypay;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AccountService account = new AccountServiceImpl();
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);
        account.printStatement();
    }
}