class BankAccount {
    String accountOwner;
    int accountBalance;

    BankAccount(String o, int b) { accountOwner = o; accountBalance = b; }
    BankAccount(String o) { accountOwner = o; }

    void deposit(int a) { accountBalance += a; }
    void printInfo() {
        System.out.println("Владелец: " + accountOwner + ", баланс: " + accountBalance);
    }
}
