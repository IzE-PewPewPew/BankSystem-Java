public class main {
    public static void main(String[] arg){
        Bank bank = new Bank();

        Account acc1 = new Account("123","John",10);
        Account acc2 = new Account("321","Ken",20);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        bank.displayAccounts();

        acc1.deposit(90);
        acc2.withdraw(10);

        bank.displayAccounts();
    }
}
