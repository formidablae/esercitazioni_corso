package esercizi_in_lezione.week7.day4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class BankServiceTest {
    private BankService service;
    private BankRepository repository;

    private BankAccount account1;
    private BankAccount account2;

    @BeforeEach
    void setUp() {
        account1 = new BankAccount("A12345", 1000.0);
        account2 = new BankAccount("B67890", 500.0);
    }

    @Test
    void testApplyFees1() {
        // GIVEN: two accounts with balances 1000.0 and 500.0
        repository = new BankRepository(List.of(account1, account2));
        service = new BankService(repository);

        // WHEN: applying fees of 1%
        service.applyFees(1.0);

        // THEN: balances should be 990.0 and 495.0
        assert account1.getBalance() == 990.0;
        assert account2.getBalance() == 495.0;
    }
}