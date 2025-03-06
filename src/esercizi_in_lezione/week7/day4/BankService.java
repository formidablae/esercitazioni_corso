package esercizi_in_lezione.week7.day4;

import java.util.List;

class BankRepository {
    private List<BankAccount> accounts;

    public BankRepository() {
        accounts = List.of(
            new BankAccount("A12345", 1000.0),
            new BankAccount("B67890", 500.0),
            new BankAccount("C54321", 2000.0),
            new BankAccount("D98765", 750.0),
            new BankAccount("E24680", 1500.0)
        );
    }

    public BankRepository(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public List<BankAccount> getAllAccounts() {
        return accounts;
    }

    void updateBalance(String accountNumber, double fee) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.applyFee(fee);
            }
        }
    }
}

public class BankService {
    private BankRepository repository;

    public BankService(BankRepository repository) {
        this.repository = repository;
    }

    public void applyFees(double feePercentage) {
        List<BankAccount> accounts = repository.getAllAccounts();
        for (BankAccount account : accounts) {
            double balance = account.getBalance();
            double fee = balance * feePercentage / 100;
            repository.updateBalance(account.getAccountNumber(), fee);
        }
    }

    public BankRepository getRepository() {
        return repository;
    }
}