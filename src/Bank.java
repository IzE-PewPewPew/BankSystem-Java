import java.util.ArrayList;
import java.util.List;
public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        System.out.println("Accounts in the bank:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
